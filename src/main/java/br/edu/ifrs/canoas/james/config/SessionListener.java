package br.edu.ifrs.canoas.james.config;

import br.edu.canoas.lds.sed.service.DisciplineService;
import org.springframework.context.ApplicationListener;
import org.springframework.security.authentication.event.AuthenticationSuccessEvent;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpSession;

/**
 * Created by rodrigo on 4/18/17.
 */
@Component
public class SessionListener implements ApplicationListener<AuthenticationSuccessEvent> {

    private final HttpSession session;
    private final DisciplineService disciplineService;

    public SessionListener(HttpSession session, DisciplineService disciplineService) {
        this.session = session;
        this.disciplineService = disciplineService;
    }

    @Override
    public void onApplicationEvent(AuthenticationSuccessEvent event) {
        session.setAttribute("menu", disciplineService.getMenuShortcuts());
    }
}