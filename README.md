# CMSC434-Team-Assignment
#####Project Title: Neighbor-2-Neighbor
######Group Android Project - App development for Helping those in need


##Authors:
- Amelia Bateman
- Zifan Xiao
- Michelle Cody
- Tony Young


##Application Description:
Application is designed to help those looking for aid by allowing them to search by resource/location. The application also has the provider in mind by allowing end-users to upload helpful events/locations to aid with current flow of resource availability.

##Installation/Notes:
- Designed/Tested to work on my Nexus 6p (currently implemented on API 18) so mileage may vary
- Installation: Clone the Repository, Build the APK, Install the APK. If you need to be told how to do this, your in the wrong place.

### XMLPullParser based on http://www.vogella.com/tutorials/AndroidXML/article.html

##TODO:
- Need to add page before AddInfo that shows/verifies correct input prior to thank-you page.
- Implement upload flyer/image (or use camera.. maybe both!)
- Clean up Search Activity
- Better Icons or Titles on Add/Search Pages
- Better/Cleaner ListView with embedded GoogleMaps
- Add Custom Container Class or use Serialization to be able to store/retrieve data
- Implement Full Search Results
- Clean out old files/Code Cleanup


##Bugs:
- Currently a known bug with the URI used to open google maps, and how it is populated. Extra '+''s are being input, but no known actual implecations in the use of the app have been seen by this. 
- A Random Crash occaisonally that has not been able to be narrowed down to anything
