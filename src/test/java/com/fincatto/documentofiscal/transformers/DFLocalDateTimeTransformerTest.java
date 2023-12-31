package com.fincatto.documentofiscal.transformers;

import com.fincatto.documentofiscal.DFConfig;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DFLocalDateTimeTransformerTest {
    
    @Test
    public void deveTransformarDataStringEmLocalDateTime() {
        Assert.assertEquals("2017-09-18T12:14:41", new DFLocalDateTimeTransformer().read("2017-09-18T12:14:41").toString());
    }
    
    @Test
    public void deveTransformarLocalDateTimeEmString() {
        Assert.assertEquals("2017-09-18T12:14:41", new DFLocalDateTimeTransformer().write((LocalDateTime.from(DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ssXXX").parse("2017-09-18T12:14:41-03:00")).atZone(DFConfig.TIMEZONE_SP.toZoneId())).toLocalDateTime()));
    }
}
