package racingcar.Dto;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.Test;

public class CarDtoTest {
    @Test
    void newRacingCar_정상_테스트() {
        CarDto carDto = new CarDto("A");
        assertThat(carDto.getCarName()).isEqualTo("A");
    }

    @Test
    void newRacingCar_에러_테스트() {
        assertThatThrownBy(() -> new CarDto("A", 1)).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void setPosition_정상_테스트() {
        CarDto carDto = new CarDto("A");
        carDto.setPosition(1);
        assertThat(carDto.getPosition()).isEqualTo(1);
    }

    @Test
    void setPosition_에러_테스트() {
        CarDto carDto = new CarDto("A");
        assertThatThrownBy(() -> carDto.setPosition(-1)).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void plusPosition_정상_테스트() {
        CarDto carDto = new CarDto("A");
        carDto.plusPosition();
        assertThat(carDto.getPosition()).isEqualTo(1);
    }
}