package com.cashfree.icon.paymenticon

import com.cashfree.paymenticons.Icon
import com.cashfree.paymenticons.IconModes
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/icons")
class IconController(
    private val iconService: IconService
) {

    // 1️⃣ Mode Icons
    @GetMapping("/mode")
    fun getModeIcon(@RequestParam mode: IconModes, @RequestParam(defaultValue = "sm") size: String): List<Icon> {
        return iconService.getModeIcon(mode, size)
    }

    // 2️⃣ Single Bank Icon
    @GetMapping("/bank")
    fun getBankIcon(@RequestParam nick: String, @RequestParam(defaultValue = "sm") size: String): Icon {
        return iconService.getBankIcon(nick, size)
    }

    // 3️⃣ Multiple Bank Icons
    @PostMapping("/banks")
    fun getBankIcons(@RequestBody nicks: List<String>, @RequestParam(defaultValue = "sm") size: String): List<Icon> {
        return iconService.getBankIcons(nicks, size)
    }
}