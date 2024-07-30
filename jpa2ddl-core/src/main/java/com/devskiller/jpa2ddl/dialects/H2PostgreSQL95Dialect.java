package com.devskiller.jpa2ddl.dialects;

import org.hibernate.dialect.PostgreSQLDialect;
import org.hibernate.tool.schema.extract.internal.SequenceInformationExtractorH2DatabaseImpl;
import org.hibernate.tool.schema.extract.spi.SequenceInformationExtractor;

public class H2PostgreSQL95Dialect extends PostgreSQLDialect
{

	@Override
	public SequenceInformationExtractor getSequenceInformationExtractor() {
		return new SequenceInformationExtractorH2DatabaseImpl();
	}
}
