/* org.agiso.core.i18n.provider.MessageProviderSupport (09-01-2015)
 * 
 * MessageProviderSupport.java
 * 
 * Copyright 2015 agiso.org.
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
package org.agiso.core.i18n.provider;

import java.text.MessageFormat;
import java.util.Locale;

/**
 * 
 * 
 * @author Karol Kopacz
 * @since 1.0
 */
public class MessageProviderSupport {
	protected MessageFormat createMessageFormat(String message, Locale locale) {
		return new MessageFormat((message != null ? message : ""), locale);
	}
}
