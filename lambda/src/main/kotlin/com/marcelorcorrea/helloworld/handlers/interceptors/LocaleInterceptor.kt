package com.marcelorcorrea.helloworld.handlers.interceptors

import com.hp.kalexa.core.interceptor.RequestInterceptor
import com.hp.kalexa.model.request.AlexaRequest
import java.util.Locale

class LocaleInterceptor : RequestInterceptor {

    override fun intercept(alexaRequest: AlexaRequest<*>) {
        val locale = Locale.forLanguageTag(alexaRequest.request.locale)
        alexaRequest.requestAttributes["locale"] = locale
    }
}
