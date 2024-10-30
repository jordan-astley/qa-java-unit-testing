public class Blackjack {
    public int compareNumbers (int n1, int n2) {
        if (n1 > 21 && n2 > 21) {
            return 0;
        } else {
            if (n1 < 21) {
                if (n2 > 21) return n1;
                else {
                    return Math.max(n2, n1);
                }
            } else {
                return n2;
            }
        }
    }
}
