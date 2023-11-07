package ui.output;

import domain.LottoTicket.LottoTicket;
import lotto.Lotto;

import java.util.List;
import java.util.Collections;
public class PurchasedLottos {
    public static void printPurchasedLottos(List<LottoTicket> lottoTickets) {
        System.out.println();
        System.out.println(lottoTickets.size() + "개를 구매했습니다.");
        for (LottoTicket ticket : lottoTickets) {
            for (Lotto lotto : ticket.getLottoNumbers()) {
                Collections.sort(lotto.getNumbers());
                System.out.println(lotto.getNumbers());
            }
        }
        System.out.println();
    }
}
