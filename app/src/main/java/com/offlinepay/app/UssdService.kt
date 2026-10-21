package com.offlinepay.app

import android.accessibilityservice.AccessibilityService
import android.view.accessibility.AccessibilityEvent

/**
 * Passive accessibility service placeholder.
 * It does not read screen content, type into USSD dialogs, or click bank/payment controls.
 * Keep payment confirmation under the user's direct control.
 */
class UssdService : AccessibilityService() {
    override fun onAccessibilityEvent(event: AccessibilityEvent?) {
        // Intentionally passive. No screen content is read or acted upon.
    }

    override fun onInterrupt() {
        // Nothing to interrupt; this service performs no automated actions.
    }
}
