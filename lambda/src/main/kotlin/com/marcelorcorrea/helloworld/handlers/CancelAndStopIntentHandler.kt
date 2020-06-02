package com.marcelorcorrea.helloworld.handlers

import com.hp.kalexa.core.intent.CancelIntentHandler
import com.hp.kalexa.core.intent.StopIntentHandler
import com.hp.kalexa.model.request.AlexaRequest
import com.hp.kalexa.model.request.IntentRequest
import com.hp.kalexa.model.response.AlexaResponse
import com.hp.kalexa.model.response.dsl.alexaResponse

class CancelAndStopIntentHandler : CancelIntentHandler, StopIntentHandler {
    override fun onCancelIntent(alexaRequest: AlexaRequest<IntentRequest>): AlexaResponse = sayGoodbye()

    override fun onStopIntent(alexaRequest: AlexaRequest<IntentRequest>): AlexaResponse = sayGoodbye()

    private fun sayGoodbye(): AlexaResponse {
        val speechText = "Goodbye"
        return alexaResponse {
            response {
                speech { speechText }
                simpleCard {
                    title = "HelloWorld"
                    content = speechText
                }
            }
        }
    }
}