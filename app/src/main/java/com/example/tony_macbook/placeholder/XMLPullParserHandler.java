package com.example.tony_macbook.placeholder;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;



public class XMLPullParserHandler {
    List<DataContainer> events;
    private DataContainer event;
    private String text;

    public XMLPullParserHandler() {
        events = new ArrayList<DataContainer>();
    }

    public List<DataContainer> getDataSets() {
        return events;
    }

    public List<DataContainer> parse(InputStream is) {
        XmlPullParserFactory factory = null;
        XmlPullParser parser = null;
        try {
            factory = XmlPullParserFactory.newInstance();
            factory.setNamespaceAware(true);
            parser = factory.newPullParser();

            parser.setInput(is, null);

            int eventType = parser.getEventType();
            while (eventType != XmlPullParser.END_DOCUMENT) {
                String tagname = parser.getName();
                switch (eventType) {
                    case XmlPullParser.START_TAG:
                        if (tagname.equalsIgnoreCase("event")) {
                            // create a new instance of dataSet
                            event = new DataContainer();
                        }
                        break;

                    case XmlPullParser.TEXT:
                        text = parser.getText();
                        break;

                    case XmlPullParser.END_TAG:
                        if (tagname.equalsIgnoreCase("event")) {
                            // add event
                            events.add(event);
                        } else if (tagname.equalsIgnoreCase("name")) {
                            event.setName(text);
                        } else if (tagname.equalsIgnoreCase("id")) {
                            event.setId(Integer.parseInt(text));
                        } else if (tagname.equalsIgnoreCase("description")) {
                            event.setDescription(text);
                        } else if (tagname.equalsIgnoreCase("time")) {
                            event.setTime(text);
                        } else if (tagname.equalsIgnoreCase("date")) {
                            event.setDate(text);
                        } else if (tagname.equalsIgnoreCase("streetaddress")) {
                            event.setAddress(text);
                        } else if (tagname.equalsIgnoreCase("category")) {
                            event.setCategories(text);
                        } else if (tagname.equalsIgnoreCase("categories")) {
                            // do nothing
                        } else if (tagname.equalsIgnoreCase("image")) {
                            // do nothing
                        }else if (tagname.equalsIgnoreCase("latitude")) {
                            // do nothing
                        } else if (tagname.equalsIgnoreCase("longitude")) {
                            // do nothing
                        } else if (tagname.equalsIgnoreCase("opennow")) {
                            // do nohting
                        } else if (tagname.equalsIgnoreCase("distance")) {
                            // do nothing
                        }
                        break;

                    default:
                        break;
                }
                eventType = parser.next();
            }

        } catch (XmlPullParserException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return events;
    }
}