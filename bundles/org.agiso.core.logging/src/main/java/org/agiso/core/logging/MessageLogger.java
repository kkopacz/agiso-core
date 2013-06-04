/* org.agiso.core.logging.MessageLogger (04-06-2013)
 * 
 * MessageLogger.java
 * 
 * Copyright 2013 agiso.org
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.agiso.core.logging;

import org.agiso.core.i18n.util.I18nUtils.I18nId;

/**
 * Interfejs wykorzystywany do logowania z wykorzystaniem wyliczeń
 * {@link MessageId}.
 * 
 * @author <a href="mailto:kkopacz@agiso.org">Karol Kopacz</a>
 * @since 1.0
 */
public interface MessageLogger extends LoggerInformer {
	public interface MessageId extends I18nId {
	}

//	--------------------------------------------------------------------------
	public void trace(MessageId messageId, Object... args);
	public void trace(Throwable t, MessageId messageId, Object... args);

	public void debug(MessageId messageId, Object... args);
	public void debug(Throwable t, MessageId messageId, Object... args);

	public void info(MessageId messageId, Object... args);
	public void info(Throwable t, MessageId messageId, Object... args);

	public void warn(MessageId messageId, Object... args);
	public void warn(Throwable t, MessageId messageId, Object... args);

	public void error(MessageId messageId, Object... args);
	public void error(Throwable t, MessageId messageId, Object... args);
}
