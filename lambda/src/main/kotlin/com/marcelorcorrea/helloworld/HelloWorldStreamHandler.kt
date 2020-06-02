package com.marcelorcorrea.helloworld

import com.hp.kalexa.core.handler.SkillConfig
import com.hp.kalexa.core.handler.lambda.AlexaRequestStreamHandler
import com.marcelorcorrea.helloworld.handlers.CancelAndStopIntentHandler
import com.marcelorcorrea.helloworld.handlers.FallbackHandler
import com.marcelorcorrea.helloworld.handlers.HelloWorldIntentHandler
import com.marcelorcorrea.helloworld.handlers.HelpIntentHandler
import com.marcelorcorrea.helloworld.handlers.LaunchRequest
import com.marcelorcorrea.helloworld.handlers.interceptors.LocaleInterceptor

/**
 * If you set SCAN_PACKAGE environment variable, you don't need to explicitly add handlers and interceptors
 */
//class HelloWorldStreamHandler: AlexaRequestStreamHandler()

/**
 * Adding handlers and interceptors manually
 */
class HelloWorldStreamHandler : AlexaRequestStreamHandler(SKILL_CONFIG) {
    companion object {
        val SKILL_CONFIG = SkillConfig(
            intentHandlers = listOf(
                CancelAndStopIntentHandler(),
                FallbackHandler(),
                HelloWorldIntentHandler(),
                HelpIntentHandler(),
                LaunchRequest()
            ),
            requestInterceptors = listOf(LocaleInterceptor())
        )
    }
}
