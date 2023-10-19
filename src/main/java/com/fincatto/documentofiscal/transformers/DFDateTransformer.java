package com.fincatto.documentofiscal.transformers;

import org.simpleframework.xml.transform.Transform;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

class DFDateTransformer implements Transform<Date> {

    private final DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.getDefault());

    @Override
    public Date read(final String value) throws Exception {
        return this.dateFormat.parse(value);
    }

    @Override
    public String write(final Date value) {
        return this.dateFormat.format(value);
    }
}