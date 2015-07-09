/*
 * Copyright Vincent Blouin under the GPL License version 3
 */

package guru.bubl.module.common_utils;

import java.util.concurrent.Callable;
import java.util.function.Supplier;

public final class NoExRun {

    public static <T> Supplier<T> wrap(Callable<T> callable) {
        return () -> {
            try {
                return callable.call();
            }
            catch (RuntimeException e) {
                throw e;
            }
            catch (Exception e) {
                throw new RuntimeException(e);
            }
        };
    }
}
