package com.marcelorcorrea.helloworld.handlers

import com.hp.kalexa.core.intent.HelpIntentHandler
import com.hp.kalexa.model.request.AlexaRequest
import com.hp.kalexa.model.request.IntentRequest
import com.hp.kalexa.model.response.AlexaResponse
import com.hp.kalexa.model.response.dsl.alexaResponse

class HelpIntentHandler : HelpIntentHandler {
    override fun onHelpIntent(alexaRequest: AlexaRequest<IntentRequest>): AlexaResponse {
        val speechText = "You can say hello to me!"
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