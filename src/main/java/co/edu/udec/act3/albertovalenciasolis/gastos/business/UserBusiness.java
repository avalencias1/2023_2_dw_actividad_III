package co.edu.udec.act3.albertovalenciasolis.gastos.business;

import co.edu.udec.act3.albertovalenciasolis.gastos.domain.response.UserResponse;

import java.util.List;

public interface UserBusiness {
    List<UserResponse> getUserFronDatabase();
}
