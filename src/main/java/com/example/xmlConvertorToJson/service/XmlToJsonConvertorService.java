package com.example.xmlConvertorToJson.service;

import com.example.xmlConvertorToJson.models.OTA_HotelSearchRS;
import com.example.xmlConvertorToJson.models.Pagination;
import com.example.xmlConvertorToJson.models.Properties;
import com.example.xmlConvertorToJson.models.TPA_Extensions;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

@Service
public class XmlToJsonConvertorService {
    public String convertXmlToJson(String xml) throws Exception {

       String modifiedXml = xmlFormattor(xml);
        JAXBContext jaxbContext = JAXBContext.newInstance(OTA_HotelSearchRS.class);
       Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
        OTA_HotelSearchRS hotelSearchRS = new OTA_HotelSearchRS();


        TPA_Extensions tpaExtensions = new TPA_Extensions();
        Pagination pagination = new Pagination();

        tpaExtensions.setPagination(pagination);

        Properties properties = new Properties();
        hotelSearchRS.setProperties(properties);
        OTA_HotelSearchRS rootElement = (OTA_HotelSearchRS) unmarshaller.unmarshal(new StringReader(modifiedXml));

        ObjectMapper objectMapper = new ObjectMapper();
        String jsonData = objectMapper.writeValueAsString(rootElement);

        return jsonData;
    }

    //Method to remove namespace and other attributes in root element using jsoup library
    public static String xmlFormattor(String xml) throws DocumentException, IOException {
        Document document = Jsoup.parse(xml, "", Parser.xmlParser());

       // Remove namespaces and other attributes in root element
        Elements elements = document.select("[xmlns], [xmlns\\:xsi]");
        for (Element element : elements) {
            element.removeAttr("xmlns");
            element.removeAttr("xmlns:xsi");
            element.removeAttr("xsi:schemaLocation");
            element.removeAttr("TimeStamp");
            element.removeAttr("Target");
            element.removeAttr("Version");
        }
        String modifiedXml = document.toString();
        return modifiedXml;
    }
}
