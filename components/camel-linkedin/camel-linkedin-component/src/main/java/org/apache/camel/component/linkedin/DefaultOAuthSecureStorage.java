/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.component.linkedin;

import org.apache.camel.component.linkedin.api.OAuthSecureStorage;
import org.apache.camel.component.linkedin.api.OAuthToken;
import org.apache.camel.component.linkedin.internal.CachingOAuthSecureStorage;

/**
 * Default implementation of {@link OAuthSecureStorage}
 * with user provided token and expiry time in msecs.
 */
public class DefaultOAuthSecureStorage extends CachingOAuthSecureStorage {

    private OAuthToken token;

    public DefaultOAuthSecureStorage(String accessToken, long expiryTime) {
        super(null);
        this.token = new OAuthToken(null, accessToken, expiryTime);
    }
}
