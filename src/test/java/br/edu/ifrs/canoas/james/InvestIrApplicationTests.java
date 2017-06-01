package br.edu.ifrs.canoas.james;

import static org.assertj.core.api.Assertions.assertThat;
import static org.fluentlenium.assertj.FluentLeniumAssertions.assertThat;
import static org.fluentlenium.core.filter.FilterConstructor.with;
import org.fluentlenium.adapter.junit.FluentTest;
import org.fluentlenium.core.hook.wait.Wait;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=WebEnvironment.RANDOM_PORT)
@Wait
public class InvestIrApplicationTests extends FluentTest{


	@Value("${local.server.port}")
	private int port;

	String getHost(){
		return "http://localhost:" + port + "/prototipo/index.html";
	}

	@Test
    public void executa_login_no_sistema_e_vai_para_tela_inicial() {
		//Vai para http://localhost:"+ port+ "/prototipo/index.html
        goTo(getHost());
        //Verifica que o título da página é da aplicação
        assertThat(window().title()).contains("InvestIR - Amanse o leão");
        //Clica no botão Login
        $("#submete_login").click();
        //Verifica que a página agora tem o nome do usuário logado no topo
        assertThat($("#nome_usuario").text()).contains("James M. Tremea");
    }


}