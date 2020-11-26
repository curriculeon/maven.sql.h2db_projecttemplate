package com.github.curriculeon.controllers;

import com.github.curriculeon.models.UserWallet;
import com.github.curriculeon.repositories.UserWalletRepository;
import com.github.curriculeon.services.UserWalletService;
import com.github.curriculeon.utils.controllers.AbstractSimpleController;
import com.github.curriculeon.utils.services.AbstractSimpleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping(value = "/user/wallet")
public class UserWalletController extends AbstractSimpleController<Long, UserWallet, UserWalletRepository, UserWalletService> {
    public UserWalletController(UserWalletService service) {
        super(service);
    }
}