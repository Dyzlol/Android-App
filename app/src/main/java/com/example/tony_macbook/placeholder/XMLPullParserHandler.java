package com.example.tony_macbook.placeholder;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;


/*************************************************
 * Public Class - XMLPullParserHandler
 * ***  Implements Androids XML Parsing Methods
 */
public class XMLPullParserHandler {

    // Declarations
    List<DataContainer> events;
    private DataContainer event;
    private String text;

    // Constructor
    public XMLPullParserHandler() {
        events = new ArrayList<DataContainer>();
    }

    // Getter *** Returns List of DataContainers
    public List<DataContainer> getDataSets() {
        return events;
    }

    // Public Method to Parse XML Input
    public List<DataContainer> parse(InputStream is) {
        XmlPullParserFactory factory = null;
        XmlPullParser parser = null;

        // TryBlock:Begin
        try {
            factory = XmlPullParserFactory.newInstance();
            factory.setNamespaceAware(true);
            parser = factory.newPullParser();
            parser.setInput(is, null);

            int eventType = parser.getEventType();
            while (eventType != XmlPullParser.END_DOCUMENT) {
                String tagname = parser.getName();

                switch (eventType) {

                    // Start of tag
                    case XmlPullParser.START_TAG:
                        if (tagname.equalsIgnoreCase("event")) {
                            // create a new instance of dataSet since its a new event tag
                            event = new DataContainer();
                        }
                        break;

                    // Not end/start tag - So store data
                    case XmlPullParser.TEXT:
                        text = parser.getText();
                        break;

                    // Found end tag - Update event container or add it to list
                    case XmlPullParser.END_TAG:
                        if (tagname.equalsIgnoreCase("event")) {
                            // add event to list since we are at end
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
                            // do nothing currently
                        } else if (tagname.equalsIgnoreCase("image")) {
                            // do nothing currently
                        }else if (tagname.equalsIgnoreCase("latitude")) {
                            // do nothing currently
                        } else if (tagname.equalsIgnoreCase("longitude")) {
                            // do nothing currently
                        } else if (tagname.equalsIgnoreCase("opennow")) {
                            // do nohting currently
                        } else if (tagname.equalsIgnoreCase("distance")) {
                            // do nothing currently
                        }
                        break;

                    default:
                        break;
                }
                eventType = parser.next(); // iterate
            }
        // TryBlock:END - Begin:Exceptions
        } catch (XmlPullParserException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Return our List of DataContainers
        return events;
    }
}