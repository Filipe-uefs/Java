package JUnit;

import java.math.BigDecimal;

public enum Desempenho {
    ABAIXO {
        @Override
        public BigDecimal percentualReajustar() {
            return new BigDecimal("0.03");
        }
    },
    NA_MEDIA {
        @Override
        public BigDecimal percentualReajustar() {
            return new BigDecimal("0.1");
        }
    },
    ACIMA {
        @Override
        public BigDecimal percentualReajustar() {
            return new BigDecimal("0.3");
        }
    };

    public abstract BigDecimal percentualReajustar();
}
