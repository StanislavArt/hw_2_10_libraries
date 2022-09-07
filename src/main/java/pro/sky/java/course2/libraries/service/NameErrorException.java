package pro.sky.java.course2.libraries.service;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class NameErrorException extends ServiceException {
    public NameErrorException() {
        super("В наименовании сотрудника присутствуют небуквенные символы");
    }
}
