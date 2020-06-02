package com.marcelorcorrea.helloworld.handlers

import com.hp.kalexa.core.intent.LaunchRequestHandler
import com.hp.kalexa.model.request.AlexaRequest
import com.hp.kalexa.model.request.LaunchRequest
import com.hp.kalexa.model.response.AlexaResponse
import com.hp.kalexa.model.response.dsl.alexaResponse

class LaunchRequest : LaunchRequestHandler {
    override fun onLaunchIntent(alexaRequest: AlexaRequest<LaunchRequest>): AlexaResponse {
        val speechText = "Welcome to the Alexa Skills Kit, you can say hello"
        return alexaResponse {
            response {
                speech { speechText }
                reprompt {
                    speech {
                        speechText
                    }
                }
                simpleCard {
                    title = "HelloWorld"
                    content = speechText
                }
            }
        }
    }
}