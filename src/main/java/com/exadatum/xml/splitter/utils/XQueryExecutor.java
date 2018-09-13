package com.exadatum.xml.splitter.utils;

import com.saxonica.xqj.SaxonXQDataSource;

import javax.xml.xquery.XQConnection;
import javax.xml.xquery.XQDataSource;
import javax.xml.xquery.XQException;
import javax.xml.xquery.XQPreparedExpression;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class XQueryExecutor {

    public XQPreparedExpression  newExp(String fileName) throws IOException, XQException {

        InputStream inputStream = new FileInputStream(new File(fileName));

        XQDataSource ds = new SaxonXQDataSource();
        XQConnection conn = ds.getConnection();

        XQPreparedExpression exp = conn.prepareExpression(inputStream);
        inputStream.close();

        return exp;
    }
}