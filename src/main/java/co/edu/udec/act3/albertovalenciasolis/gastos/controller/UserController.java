package co.edu.udec.act3.albertovalenciasolis.gastos.controller;

import co.edu.udec.act3.albertovalenciasolis.gastos.business.UserBusiness;
import co.edu.udec.act3.albertovalenciasolis.gastos.domain.request.UsuarioRegistroRequest;
import co.edu.udec.act3.albertovalenciasolis.gastos.domain.response.UserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("users")
public class UserController {
    @Autowired
    private UserBusiness userBusiness;
    @GetMapping("/list-users")
    public List<UserResponse> getUsersFromDatabase(){
        return userBusiness.getUserFronDatabase();
    }

    @PostMapping("/registro")
    public void registroUser(UsuarioRegistroRequest usuarioRequest){
        return;
    }
}
