import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.BDDMockito.given;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.restdocs.practice.api.controller.PersonController;
import com.restdocs.practice.api.domain.Gender;
import com.restdocs.practice.api.dto.PersonDto;
import com.restdocs.practice.service.PersonService;
import java.time.LocalDate;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.restdocs.AutoConfigureRestDocs;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@WebMvcTest(PersonController.class)
//@AutoConfigureRestDocs에 uri가 설정되어 있으면 적용한다.
@AutoConfigureRestDocs(uriScheme = "https", uriHost = "docs.api.com")
public class PersonDocumentationTests {

  @Autowired
  private MockMvc mockMvc;

  @Autowired
  private ObjectMapper objectMapper;

  //mocking을 하기 위해 @MockBean을 선언하였다.
  @MockBean
  private PersonService personService;

  @Test
  public void update() throws Exception {

    //given
    PersonDto.Response response = PersonDto.Response.builder()
        .id(1L)
        .firstName("Sigrid")
        .lastName("Jin")
        .birthDate(LocalDate.of(1998, 3, 5))
        .gender(Gender.MALE)
        .hobby("코딩하기")
        .build();

    given(personService.update(eq(1L), any(PersonDto.Update.class)))
        .willReturn(response);

    //when
    PersonDto.Update update = new
  }
}
