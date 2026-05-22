package ${package};

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class SanityTest {

    @Mock
    Sanity sanity;

    @Test
    void should_be_sane() {
        when(sanity.isSane()).thenReturn(true);

        assertThat(sanity.isSane()).isTrue();
    }

    private class Sanity {
        private final boolean isSane;

        public Sanity(boolean isSane) {
            this.isSane = isSane;
        }

        boolean isSane() {
            return isSane;
        }
    }
}
