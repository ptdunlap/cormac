/*
 * Copyright 2015 bananaforscale.org
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.bananaforscale.cormac.exception.datasource;

import static org.junit.Assert.assertSame;
import org.junit.Test;

/**
 * Tests the {@link ReadException} class.
 */
public class ReadExceptionTest {

    /**
     * Tests the {@link ReadException#ReadException()} constructor. Checks that the
     * {@link ReadException} is built with the default message.
     */
    @Test
    public void testConstructorWithoutMessage() {
        final ReadException exception = new ReadException();
        assertSame(ReadException.DEFAULT_MESSAGE, exception.getMessage());
    }

    /**
     * Tests the {@link ReadException#ReadException(java.lang.String)} constructor. Checks that the
     * {@link ReadException} is built with the specified message.
     */
    @Test
    public void testConstructorWithMessage() {
        final String message = "testmessage";
        final ReadException exception = new ReadException(message);
        assertSame(message, exception.getMessage());
    }

}
