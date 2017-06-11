package com.zsmartsystems.zwave.commandclass.impl;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.zsmartsystems.zwave.commandclass.ZWaveCommandClassTest;

/**
 * Test cases for {@link CommandClassManufacturerProprietaryFibaroFgrm222V1Test}.
 *
 * @author Chris Jackson
 */
public class CommandClassManufacturerProprietaryFibaroFgrm222V1Test extends ZWaveCommandClassTest {

    @Test
    public void getFgrm222SetLamella() {
        byte[] expectedResponse1 = { (byte) 0x91, 0x01, 0x0F, 0x26, 0x01, 0x01, 0x00, 0x01 };
        byte[] expectedResponse2 = { (byte) 0x91, 0x01, 0x0F, 0x26, 0x01, 0x01, 0x00, 0x30 };

        byte[] x = CommandClassManufacturerProprietaryFibaroFgrm222V1.getFgrm222Set("LAMELLA_POSITION", 0, 1);
        assertTrue(Arrays.equals(
                CommandClassManufacturerProprietaryFibaroFgrm222V1.getFgrm222Set("LAMELLA_POSITION", 0, 1),
                expectedResponse1));
        assertTrue(Arrays.equals(
                CommandClassManufacturerProprietaryFibaroFgrm222V1.getFgrm222Set("LAMELLA_POSITION", 0, 48),
                expectedResponse2));
    }

    @Test
    public void getFgrm222SetShutter() {
        byte[] expectedResponse = { (byte) 0x91, 0x01, 0x0F, 0x26, 0x01, 0x02, 0x00, 0x30 };

        assertTrue(Arrays.equals(
                CommandClassManufacturerProprietaryFibaroFgrm222V1.getFgrm222Set("SHUTTER_POSITION", 0, 48),
                expectedResponse));
    }

    @Test
    public void handleReport() {
        Map<String, Map<String, Object>> tests = new HashMap<String, Map<String, Object>>();
        Map<String, Object> test = new HashMap<String, Object>();

        test.clear();
        test.put("input", new byte[] { (byte) 0x91, 0x01, 0x0F, 0x26, 0x03, 0x03, 0x44, 0x30 });
        test.put("SHUTTER_POSITION", 68);
        test.put("LAMELLA_POSITION", 48);
        tests.put("Shutter 68, Lamella 48...", test);

        for (String testName : tests.keySet()) {
            System.out.println("Running report test for " + this.getClass().getSimpleName() + ": " + testName);

            Map<String, Object> testData = tests.get(testName);
            Map<String, Object> report = CommandClassManufacturerProprietaryFibaroFgrm222V1
                    .handleFgrm222Report((byte[]) testData.get("input"));

            checkResponse(testData, report);
        }
    }

}
