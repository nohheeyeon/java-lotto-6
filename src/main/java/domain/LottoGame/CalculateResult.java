package domain.LottoGame;

import domain.LottoTicket.LottoTicket;
import lotto.Lotto;
import java.util.HashMap;
import java.util.Map;
import domain.WinningNumbers;
import java.util.List;
public class CalculateResult {
    public static LottoGameResult calculateResult(List<LottoTicket> tickets, WinningNumbers winningNumbers) {
        Map<Integer, Long> matchCounts = new HashMap<>();

        // 각 로또 티켓의 로또 번호들에 대해 결과를 계산
        for (LottoTicket ticket : tickets) {
            for (Lotto lotto : ticket.getLottoNumbers()) {
                int matchCount = CountMatchingNumbers.getCountMatchingNumbers(lotto, winningNumbers);
                matchCounts.put(matchCount, matchCounts.getOrDefault(matchCount, 0L) + 1);
            }
        }

        return new LottoGameResult(matchCounts);
    }
}