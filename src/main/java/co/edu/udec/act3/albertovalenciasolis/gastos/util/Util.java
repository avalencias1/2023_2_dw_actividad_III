package co.edu.udec.act3.albertovalenciasolis.gastos.util;

import co.edu.udec.act3.albertovalenciasolis.gastos.domain.response.UserResponse;
import co.edu.udec.act3.albertovalenciasolis.gastos.model.UserEntity;

public class Util {

    public static UserResponse convertToUserResponse(UserEntity userEntity){
        UserResponse userResponse = new UserResponse();
        userResponse.setUserName(userEntity.getNombreUsuario());
        userResponse.setIdNumber(userEntity.getDocumentoUsuario());
        return userResponse;
    }

}
