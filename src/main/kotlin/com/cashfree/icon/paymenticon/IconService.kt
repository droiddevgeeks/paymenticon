package com.cashfree.icon.paymenticon

import com.cashfree.paymenticons.Icon
import com.cashfree.paymenticons.IconModes
import com.cashfree.paymenticons.PaymentIcons
import org.springframework.stereotype.Service

@Service
class IconService {

    fun getModeIcon(mode: IconModes, size: String): List<Icon> {
        return PaymentIcons.getModesLogo(mode, size)
    }

    fun getBankIcon(nick: String, size: String): Icon {
        return PaymentIcons.getLogo(nick, size)
    }

    fun getBankIcons(nicks: List<String>, size: String): List<Icon> {
        return PaymentIcons.getLogos(nicks, size)
    }
}