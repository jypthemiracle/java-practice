package com.restdocs.practice.utils;

import static org.springframework.restdocs.operation.preprocess.Preprocessors.modifyUris;
import static org.springframework.restdocs.operation.preprocess.Preprocessors.preprocessRequest;
import static org.springframework.restdocs.operation.preprocess.Preprocessors.preprocessResponse;
import static org.springframework.restdocs.operation.preprocess.Preprocessors.prettyPrint;

import org.springframework.restdocs.operation.preprocess.OperationRequestPreprocessor;
import org.springframework.restdocs.operation.preprocess.OperationResponsePreprocessor;

public interface ApiDocumentUtils {
  //여기 URI 적용은 보통 2단계로 간주된다.
  static OperationRequestPreprocessor getDocumentRequest() {
    return preprocessRequest(
        modifyUris()
            .scheme("https")
            .host("docs.api.com")
            .removePort(),
        prettyPrint());
  }

  static OperationResponsePreprocessor getDocumentResponse() {
    return preprocessResponse(prettyPrint());
  }
}
