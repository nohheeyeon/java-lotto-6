package domain;

import domain.Lotto;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

class LottoTest {
    @DisplayName("로또 번호의 개수가 6개가 넘어가면 예외가 발생한다.")
    @Test
    void createLottoByOverSize() {
        assertThatThrownBy(() -> new Lotto(List.of(1, 2, 3, 4, 5, 6, 7)))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("로또 번호에 중복된 숫자가 있으면 예외가 발생한다.")
    @Test
    void createLottoByDuplicatedNumber() {
        // TODO: 이 테스트가 통과할 수 있게 구현 코드 작성
        assertThatThrownBy(() -> new Lotto(List.of(1, 2, 3, 4, 5, 5)))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("로또 번호에 음수가 있으면 예외가 발생한다.")
    @Test
    void createLottoByNumberNegative() {

    }

    @DisplayName("로또 번호가 1~45에 속해있지않으면 예외가 발생한다.")
    @Test
    void createLottoOutOfRange() {

    }

    @DisplayName("보너스 번호에 중복된 숫자가 있으면 예외가 발생한다.")
    @Test
    void duplicateBonusNumber() {

    }

    @DisplayName("로또 번호가 오름차순되어 출력되지 않으면 예외가 발생한다.")
    @Test
    void LottoNumbersInAscendingOrder() {

    }
}