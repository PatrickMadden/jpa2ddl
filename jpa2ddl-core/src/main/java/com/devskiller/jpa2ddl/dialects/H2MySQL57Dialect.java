package com.devskiller.jpa2ddl.dialects;

import org.hibernate.dialect.MySQLDialect;
import org.hibernate.tool.schema.extract.internal.SequenceInformationExtractorH2DatabaseImpl;
import org.hibernate.tool.schema.extract.spi.SequenceInformationExtractor;

public class H2MySQL57Dialect extends MySQLDialect
{

	@Override
	public SequenceInformationExtractor getSequenceInformationExtractor() {
		return new SequenceInformationExtractorH2DatabaseImpl();
	}
}
