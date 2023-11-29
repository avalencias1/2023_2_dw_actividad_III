package co.edu.udec.act3.albertovalenciasolis.gastos.business;

import co.edu.udec.act3.albertovalenciasolis.gastos.domain.response.UserResponse;
import co.edu.udec.act3.albertovalenciasolis.gastos.model.UserEntity;
import co.edu.udec.act3.albertovalenciasolis.gastos.repository.UserRepository;
import co.edu.udec.act3.albertovalenciasolis.gastos.util.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserBusinessImpl implements UserBusiness {
    @Autowired
    private UserRepository userRepository;
    @Override
    public List<UserResponse> getUserFronDatabase() {
        List<UserEntity> usersList = userRepository.findAll();
        List<UserResponse> userResponseList = usersList.stream()
                .map(userEntity -> Util.convertToUserResponse(userEntity))
                .collect(Collectors.toList());
        return userResponseList;
    }
}
