package com.marcelorcorrea.helloworld.handlers

import com.hp.kalexa.core.intent.FallbackIntentHandler
import com.hp.kalexa.model.request.AlexaRequest
import com.hp.kalexa.model.request.IntentRequest
import com.hp.kalexa.model.response.AlexaResponse
import com.hp.kalexa.model.response.dsl.alexaResponse

class FallbackHandler : FallbackIntentHandler {
    override fun onFallbackIntent(alexaRequest: AlexaRequest<IntentRequest>): AlexaResponse {
        val speechText = "Sorry, I don't know that. You can say try saying help!"
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