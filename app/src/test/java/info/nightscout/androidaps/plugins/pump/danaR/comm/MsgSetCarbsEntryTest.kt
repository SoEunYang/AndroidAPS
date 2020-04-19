package info.nightscout.androidaps.plugins.pump.danaR.comm

import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.powermock.modules.junit4.PowerMockRunner

@RunWith(PowerMockRunner::class)
class MsgSetCarbsEntryTest : DanaRTestBase() {

    @Test fun runTest() {
        val packet = MsgSetCarbsEntry(aapsLogger, System.currentTimeMillis(), 10)

        // test message decoding
        packet.handleMessage(createArray(34, 7.toByte()))
        Assert.assertEquals(true, packet.failed)
    }
}