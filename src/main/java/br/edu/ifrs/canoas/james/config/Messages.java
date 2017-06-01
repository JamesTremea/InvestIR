package br.edu.ifrs.canoas.james.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.support.MessageSourceAccessor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Locale;

/**
 * Created by rodrigo on 3/16/17.
 */
@Component
public class Messages {

	@Autowired
	private MessageSource messageSource;

	private MessageSourceAccessor accessor;

	@PostConstruct
	private void init() {
		accessor = new MessageSourceAccessor(messageSource, Locale.ENGLISH);
	}

	public String get(String code) {
		return accessor.getMessage(code);
	}

}