/*
 * The MIT License
 * Copyright (c) 2012 Microsoft Corporation
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package microsoft.exchange.webservices.data.util;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TimeZone;

import microsoft.exchange.webservices.data.property.complex.time.OlsonTimeZoneDefinition;
import microsoft.exchange.webservices.data.property.complex.time.TimeZoneDefinition;

/**
 * Miscellany timezone functions
 */
public class TimeZoneUtils {
  
  //a map of olson name > Microsoft Name
  final static private Map<String, String> olsonTimeZoneToMs = new HashMap<String, String>();

  static {
    olsonTimeZoneToMs.put("Africa/Abidjan", "Greenwich Standard Time");
    olsonTimeZoneToMs.put("Africa/Accra", "Greenwich Standard Time");
    olsonTimeZoneToMs.put("Africa/Addis_Ababa", "E. Africa Standard Time");
    olsonTimeZoneToMs.put("Africa/Algiers", "W. Central Africa Standard Time");
    olsonTimeZoneToMs.put("Africa/Asmara", "E. Africa Standard Time");
    olsonTimeZoneToMs.put("Africa/Asmera", "E. Africa Standard Time");
    olsonTimeZoneToMs.put("Africa/Bamako", "Greenwich Standard Time");
    olsonTimeZoneToMs.put("Africa/Bangui", "W. Central Africa Standard Time");
    olsonTimeZoneToMs.put("Africa/Banjul", "Greenwich Standard Time");
    olsonTimeZoneToMs.put("Africa/Bissau", "Greenwich Standard Time");
    olsonTimeZoneToMs.put("Africa/Blantyre", "South Africa Standard Time");
    olsonTimeZoneToMs.put("Africa/Brazzaville", "W. Central Africa Standard Time");
    olsonTimeZoneToMs.put("Africa/Bujumbura", "South Africa Standard Time");
    olsonTimeZoneToMs.put("Africa/Cairo", "Egypt Standard Time");
    olsonTimeZoneToMs.put("Africa/Casablanca", "Morocco Standard Time");
    olsonTimeZoneToMs.put("Africa/Ceuta", "Romance Standard Time");
    olsonTimeZoneToMs.put("Africa/Conakry", "Greenwich Standard Time");
    olsonTimeZoneToMs.put("Africa/Dakar", "Greenwich Standard Time");
    olsonTimeZoneToMs.put("Africa/Dar_es_Salaam", "E. Africa Standard Time");
    olsonTimeZoneToMs.put("Africa/Djibouti", "E. Africa Standard Time");
    olsonTimeZoneToMs.put("Africa/Douala", "W. Central Africa Standard Time");
    olsonTimeZoneToMs.put("Africa/El_Aaiun", "Morocco Standard Time");
    olsonTimeZoneToMs.put("Africa/Freetown", "Greenwich Standard Time");
    olsonTimeZoneToMs.put("Africa/Gaborone", "South Africa Standard Time");
    olsonTimeZoneToMs.put("Africa/Harare", "South Africa Standard Time");
    olsonTimeZoneToMs.put("Africa/Johannesburg", "South Africa Standard Time");
    olsonTimeZoneToMs.put("Africa/Juba", "E. Africa Standard Time");
    olsonTimeZoneToMs.put("Africa/Kampala", "E. Africa Standard Time");
    olsonTimeZoneToMs.put("Africa/Khartoum", "E. Africa Standard Time");
    olsonTimeZoneToMs.put("Africa/Kigali", "South Africa Standard Time");
    olsonTimeZoneToMs.put("Africa/Kinshasa", "W. Central Africa Standard Time");
    olsonTimeZoneToMs.put("Africa/Lagos", "W. Central Africa Standard Time");
    olsonTimeZoneToMs.put("Africa/Libreville", "W. Central Africa Standard Time");
    olsonTimeZoneToMs.put("Africa/Lome", "Greenwich Standard Time");
    olsonTimeZoneToMs.put("Africa/Luanda", "W. Central Africa Standard Time");
    olsonTimeZoneToMs.put("Africa/Lubumbashi", "South Africa Standard Time");
    olsonTimeZoneToMs.put("Africa/Lusaka", "South Africa Standard Time");
    olsonTimeZoneToMs.put("Africa/Malabo", "W. Central Africa Standard Time");
    olsonTimeZoneToMs.put("Africa/Maputo", "South Africa Standard Time");
    olsonTimeZoneToMs.put("Africa/Maseru", "South Africa Standard Time");
    olsonTimeZoneToMs.put("Africa/Mbabane", "South Africa Standard Time");
    olsonTimeZoneToMs.put("Africa/Mogadishu", "E. Africa Standard Time");
    olsonTimeZoneToMs.put("Africa/Monrovia", "Greenwich Standard Time");
    olsonTimeZoneToMs.put("Africa/Nairobi", "E. Africa Standard Time");
    olsonTimeZoneToMs.put("Africa/Ndjamena", "W. Central Africa Standard Time");
    olsonTimeZoneToMs.put("Africa/Niamey", "W. Central Africa Standard Time");
    olsonTimeZoneToMs.put("Africa/Nouakchott", "Greenwich Standard Time");
    olsonTimeZoneToMs.put("Africa/Ouagadougou", "Greenwich Standard Time");
    olsonTimeZoneToMs.put("Africa/Porto-Novo", "W. Central Africa Standard Time");
    olsonTimeZoneToMs.put("Africa/Sao_Tome", "Greenwich Standard Time");
    olsonTimeZoneToMs.put("Africa/Timbuktu", "Greenwich Standard Time");
    olsonTimeZoneToMs.put("Africa/Tripoli", "Libya Standard Time");
    olsonTimeZoneToMs.put("Africa/Tunis", "W. Central Africa Standard Time");
    olsonTimeZoneToMs.put("Africa/Windhoek", "Namibia Standard Time");
    olsonTimeZoneToMs.put("America/Anchorage", "Alaskan Standard Time");
    olsonTimeZoneToMs.put("America/Anguilla", "SA Western Standard Time");
    olsonTimeZoneToMs.put("America/Antigua", "SA Western Standard Time");
    olsonTimeZoneToMs.put("America/Araguaina", "SA Eastern Standard Time");
    olsonTimeZoneToMs.put("America/Argentina/Buenos_Aires", "Argentina Standard Time");
    olsonTimeZoneToMs.put("America/Argentina/Catamarca", "Argentina Standard Time");
    olsonTimeZoneToMs.put("America/Argentina/ComodRivadavia", "Argentina Standard Time");
    olsonTimeZoneToMs.put("America/Argentina/Cordoba", "Argentina Standard Time");
    olsonTimeZoneToMs.put("America/Argentina/Jujuy", "Argentina Standard Time");
    olsonTimeZoneToMs.put("America/Argentina/La_Rioja", "Argentina Standard Time");
    olsonTimeZoneToMs.put("America/Argentina/Mendoza", "Argentina Standard Time");
    olsonTimeZoneToMs.put("America/Argentina/Rio_Gallegos", "Argentina Standard Time");
    olsonTimeZoneToMs.put("America/Argentina/Salta", "Argentina Standard Time");
    olsonTimeZoneToMs.put("America/Argentina/San_Juan", "Argentina Standard Time");
    olsonTimeZoneToMs.put("America/Argentina/San_Luis", "Argentina Standard Time");
    olsonTimeZoneToMs.put("America/Argentina/Tucuman", "Argentina Standard Time");
    olsonTimeZoneToMs.put("America/Argentina/Ushuaia", "Argentina Standard Time");
    olsonTimeZoneToMs.put("America/Aruba", "SA Western Standard Time");
    olsonTimeZoneToMs.put("America/Asuncion", "Paraguay Standard Time");
    olsonTimeZoneToMs.put("America/Atikokan", "SA Pacific Standard Time");
    olsonTimeZoneToMs.put("America/Bahia", "Bahia Standard Time");
    olsonTimeZoneToMs.put("America/Bahia_Banderas", "Central Standard Time (Mexico)");
    olsonTimeZoneToMs.put("America/Barbados", "SA Western Standard Time");
    olsonTimeZoneToMs.put("America/Belem", "SA Eastern Standard Time");
    olsonTimeZoneToMs.put("America/Belize", "Central America Standard Time");
    olsonTimeZoneToMs.put("America/Blanc-Sablon", "SA Western Standard Time");
    olsonTimeZoneToMs.put("America/Boa_Vista", "SA Western Standard Time");
    olsonTimeZoneToMs.put("America/Bogota", "SA Pacific Standard Time");
    olsonTimeZoneToMs.put("America/Boise", "Mountain Standard Time");
    olsonTimeZoneToMs.put("America/Buenos_Aires", "Argentina Standard Time");
    olsonTimeZoneToMs.put("America/Cambridge_Bay", "Mountain Standard Time");
    olsonTimeZoneToMs.put("America/Campo_Grande", "Central Brazilian Standard Time");
    olsonTimeZoneToMs.put("America/Cancun", "Eastern Standard Time (Mexico)");
    olsonTimeZoneToMs.put("America/Caracas", "Venezuela Standard Time");
    olsonTimeZoneToMs.put("America/Catamarca", "Argentina Standard Time");
    olsonTimeZoneToMs.put("America/Cayenne", "SA Eastern Standard Time");
    olsonTimeZoneToMs.put("America/Cayman", "SA Pacific Standard Time");
    olsonTimeZoneToMs.put("America/Chicago", "Central Standard Time");
    olsonTimeZoneToMs.put("America/Chihuahua", "Mountain Standard Time (Mexico)");
    olsonTimeZoneToMs.put("America/Coral_Harbour", "SA Pacific Standard Time");
    olsonTimeZoneToMs.put("America/Cordoba", "Argentina Standard Time");
    olsonTimeZoneToMs.put("America/Costa_Rica", "Central America Standard Time");
    olsonTimeZoneToMs.put("America/Creston", "US Mountain Standard Time");
    olsonTimeZoneToMs.put("America/Cuiaba", "Central Brazilian Standard Time");
    olsonTimeZoneToMs.put("America/Curacao", "SA Western Standard Time");
    olsonTimeZoneToMs.put("America/Danmarkshavn", "UTC");
    olsonTimeZoneToMs.put("America/Dawson", "Pacific Standard Time");
    olsonTimeZoneToMs.put("America/Dawson_Creek", "US Mountain Standard Time");
    olsonTimeZoneToMs.put("America/Denver", "Mountain Standard Time");
    olsonTimeZoneToMs.put("America/Detroit", "Eastern Standard Time");
    olsonTimeZoneToMs.put("America/Dominica", "SA Western Standard Time");
    olsonTimeZoneToMs.put("America/Edmonton", "Mountain Standard Time");
    olsonTimeZoneToMs.put("America/Eirunepe", "SA Pacific Standard Time");
    olsonTimeZoneToMs.put("America/El_Salvador", "Central America Standard Time");
    olsonTimeZoneToMs.put("America/Ensenada", "Pacific Standard Time");
    olsonTimeZoneToMs.put("America/Fort_Wayne", "US Eastern Standard Time");
    olsonTimeZoneToMs.put("America/Fortaleza", "SA Eastern Standard Time");
    olsonTimeZoneToMs.put("America/Glace_Bay", "Atlantic Standard Time");
    olsonTimeZoneToMs.put("America/Godthab", "Greenland Standard Time");
    olsonTimeZoneToMs.put("America/Goose_Bay", "Atlantic Standard Time");
    olsonTimeZoneToMs.put("America/Grand_Turk", "SA Western Standard Time");
    olsonTimeZoneToMs.put("America/Grenada", "SA Western Standard Time");
    olsonTimeZoneToMs.put("America/Guadeloupe", "SA Western Standard Time");
    olsonTimeZoneToMs.put("America/Guatemala", "Central America Standard Time");
    olsonTimeZoneToMs.put("America/Guayaquil", "SA Pacific Standard Time");
    olsonTimeZoneToMs.put("America/Guyana", "SA Western Standard Time");
    olsonTimeZoneToMs.put("America/Halifax", "Atlantic Standard Time");
    olsonTimeZoneToMs.put("America/Havana", "Eastern Standard Time");
    olsonTimeZoneToMs.put("America/Hermosillo", "US Mountain Standard Time");
    olsonTimeZoneToMs.put("America/Indiana/Indianapolis", "US Eastern Standard Time");
    olsonTimeZoneToMs.put("America/Indiana/Knox", "Central Standard Time");
    olsonTimeZoneToMs.put("America/Indiana/Marengo", "US Eastern Standard Time");
    olsonTimeZoneToMs.put("America/Indiana/Petersburg", "Eastern Standard Time");
    olsonTimeZoneToMs.put("America/Indiana/Tell_City", "Central Standard Time");
    olsonTimeZoneToMs.put("America/Indiana/Vevay", "US Eastern Standard Time");
    olsonTimeZoneToMs.put("America/Indiana/Vincennes", "Eastern Standard Time");
    olsonTimeZoneToMs.put("America/Indiana/Winamac", "Eastern Standard Time");
    olsonTimeZoneToMs.put("America/Indianapolis", "US Eastern Standard Time");
    olsonTimeZoneToMs.put("America/Inuvik", "Mountain Standard Time");
    olsonTimeZoneToMs.put("America/Iqaluit", "Eastern Standard Time");
    olsonTimeZoneToMs.put("America/Jamaica", "SA Pacific Standard Time");
    olsonTimeZoneToMs.put("America/Jujuy", "Argentina Standard Time");
    olsonTimeZoneToMs.put("America/Juneau", "Alaskan Standard Time");
    olsonTimeZoneToMs.put("America/Kentucky/Louisville", "Eastern Standard Time");
    olsonTimeZoneToMs.put("America/Kentucky/Monticello", "Eastern Standard Time");
    olsonTimeZoneToMs.put("America/Knox_IN", "Central Standard Time");
    olsonTimeZoneToMs.put("America/Kralendijk", "SA Western Standard Time");
    olsonTimeZoneToMs.put("America/La_Paz", "SA Western Standard Time");
    olsonTimeZoneToMs.put("America/Lima", "SA Pacific Standard Time");
    olsonTimeZoneToMs.put("America/Los_Angeles", "Pacific Standard Time");
    olsonTimeZoneToMs.put("America/Louisville", "Eastern Standard Time");
    olsonTimeZoneToMs.put("America/Lower_Princes", "SA Western Standard Time");
    olsonTimeZoneToMs.put("America/Maceio", "SA Eastern Standard Time");
    olsonTimeZoneToMs.put("America/Managua", "Central America Standard Time");
    olsonTimeZoneToMs.put("America/Manaus", "SA Western Standard Time");
    olsonTimeZoneToMs.put("America/Marigot", "SA Western Standard Time");
    olsonTimeZoneToMs.put("America/Martinique", "SA Western Standard Time");
    olsonTimeZoneToMs.put("America/Matamoros", "Central Standard Time");
    olsonTimeZoneToMs.put("America/Mazatlan", "Mountain Standard Time (Mexico)");
    olsonTimeZoneToMs.put("America/Mendoza", "Argentina Standard Time");
    olsonTimeZoneToMs.put("America/Menominee", "Central Standard Time");
    olsonTimeZoneToMs.put("America/Merida", "Central Standard Time (Mexico)");
    olsonTimeZoneToMs.put("America/Mexico_City", "Central Standard Time (Mexico)");
    olsonTimeZoneToMs.put("America/Moncton", "Atlantic Standard Time");
    olsonTimeZoneToMs.put("America/Monterrey", "Central Standard Time (Mexico)");
    olsonTimeZoneToMs.put("America/Montevideo", "Montevideo Standard Time");
    olsonTimeZoneToMs.put("America/Montreal", "Eastern Standard Time");
    olsonTimeZoneToMs.put("America/Montserrat", "SA Western Standard Time");
    olsonTimeZoneToMs.put("America/Nassau", "Eastern Standard Time");
    olsonTimeZoneToMs.put("America/New_York", "Eastern Standard Time");
    olsonTimeZoneToMs.put("America/Nipigon", "Eastern Standard Time");
    olsonTimeZoneToMs.put("America/Nome", "Alaskan Standard Time");
    olsonTimeZoneToMs.put("America/Noronha", "UTC-02");
    olsonTimeZoneToMs.put("America/North_Dakota/Beulah", "Central Standard Time");
    olsonTimeZoneToMs.put("America/North_Dakota/Center", "Central Standard Time");
    olsonTimeZoneToMs.put("America/North_Dakota/New_Salem", "Central Standard Time");
    olsonTimeZoneToMs.put("America/Ojinaga", "Mountain Standard Time");
    olsonTimeZoneToMs.put("America/Panama", "SA Pacific Standard Time");
    olsonTimeZoneToMs.put("America/Pangnirtung", "Eastern Standard Time");
    olsonTimeZoneToMs.put("America/Paramaribo", "SA Eastern Standard Time");
    olsonTimeZoneToMs.put("America/Phoenix", "US Mountain Standard Time");
    olsonTimeZoneToMs.put("America/Port-au-Prince", "Eastern Standard Time");
    olsonTimeZoneToMs.put("America/Port_of_Spain", "SA Western Standard Time");
    olsonTimeZoneToMs.put("America/Porto_Acre", "SA Pacific Standard Time");
    olsonTimeZoneToMs.put("America/Porto_Velho", "SA Western Standard Time");
    olsonTimeZoneToMs.put("America/Puerto_Rico", "SA Western Standard Time");
    olsonTimeZoneToMs.put("America/Rainy_River", "Central Standard Time");
    olsonTimeZoneToMs.put("America/Rankin_Inlet", "Central Standard Time");
    olsonTimeZoneToMs.put("America/Recife", "SA Eastern Standard Time");
    olsonTimeZoneToMs.put("America/Regina", "Canada Central Standard Time");
    olsonTimeZoneToMs.put("America/Resolute", "Central Standard Time");
    olsonTimeZoneToMs.put("America/Rio_Branco", "SA Pacific Standard Time");
    olsonTimeZoneToMs.put("America/Rosario", "Argentina Standard Time");
    olsonTimeZoneToMs.put("America/Santa_Isabel", "Pacific Standard Time (Mexico)");
    olsonTimeZoneToMs.put("America/Santarem", "SA Eastern Standard Time");
    olsonTimeZoneToMs.put("America/Santiago", "Pacific SA Standard Time");
    olsonTimeZoneToMs.put("America/Santo_Domingo", "SA Western Standard Time");
    olsonTimeZoneToMs.put("America/Sao_Paulo", "E. South America Standard Time");
    olsonTimeZoneToMs.put("America/Scoresbysund", "Azores Standard Time");
    olsonTimeZoneToMs.put("America/Shiprock", "Mountain Standard Time");
    olsonTimeZoneToMs.put("America/Sitka", "Alaskan Standard Time");
    olsonTimeZoneToMs.put("America/St_Barthelemy", "SA Western Standard Time");
    olsonTimeZoneToMs.put("America/St_Johns", "Newfoundland Standard Time");
    olsonTimeZoneToMs.put("America/St_Kitts", "SA Western Standard Time");
    olsonTimeZoneToMs.put("America/St_Lucia", "SA Western Standard Time");
    olsonTimeZoneToMs.put("America/St_Thomas", "SA Western Standard Time");
    olsonTimeZoneToMs.put("America/St_Vincent", "SA Western Standard Time");
    olsonTimeZoneToMs.put("America/Swift_Current", "Canada Central Standard Time");
    olsonTimeZoneToMs.put("America/Tegucigalpa", "Central America Standard Time");
    olsonTimeZoneToMs.put("America/Thule", "Atlantic Standard Time");
    olsonTimeZoneToMs.put("America/Thunder_Bay", "Eastern Standard Time");
    olsonTimeZoneToMs.put("America/Tijuana", "Pacific Standard Time");
    olsonTimeZoneToMs.put("America/Toronto", "Eastern Standard Time");
    olsonTimeZoneToMs.put("America/Tortola", "SA Western Standard Time");
    olsonTimeZoneToMs.put("America/Vancouver", "Pacific Standard Time");
    olsonTimeZoneToMs.put("America/Virgin", "SA Western Standard Time");
    olsonTimeZoneToMs.put("America/Whitehorse", "Pacific Standard Time");
    olsonTimeZoneToMs.put("America/Winnipeg", "Central Standard Time");
    olsonTimeZoneToMs.put("America/Yakutat", "Alaskan Standard Time");
    olsonTimeZoneToMs.put("America/Yellowknife", "Mountain Standard Time");
    olsonTimeZoneToMs.put("Antarctica/Casey", "W. Australia Standard Time");
    olsonTimeZoneToMs.put("Antarctica/Davis", "SE Asia Standard Time");
    olsonTimeZoneToMs.put("Antarctica/DumontDUrville", "West Pacific Standard Time");
    olsonTimeZoneToMs.put("Antarctica/Macquarie", "Central Pacific Standard Time");
    olsonTimeZoneToMs.put("Antarctica/Mawson", "West Asia Standard Time");
    olsonTimeZoneToMs.put("Antarctica/McMurdo", "New Zealand Standard Time");
    olsonTimeZoneToMs.put("Antarctica/Palmer", "Pacific SA Standard Time");
    olsonTimeZoneToMs.put("Antarctica/Rothera", "SA Eastern Standard Time");
    olsonTimeZoneToMs.put("Antarctica/South_Pole", "New Zealand Standard Time");
    olsonTimeZoneToMs.put("Antarctica/Syowa", "E. Africa Standard Time");
    olsonTimeZoneToMs.put("Antarctica/Vostok", "Central Asia Standard Time");
    olsonTimeZoneToMs.put("Arctic/Longyearbyen", "W. Europe Standard Time");
    olsonTimeZoneToMs.put("Asia/Aden", "Arab Standard Time");
    olsonTimeZoneToMs.put("Asia/Almaty", "Central Asia Standard Time");
    olsonTimeZoneToMs.put("Asia/Amman", "Jordan Standard Time");
    olsonTimeZoneToMs.put("Asia/Anadyr", "Russia Time Zone 11");
    olsonTimeZoneToMs.put("Asia/Aqtau", "West Asia Standard Time");
    olsonTimeZoneToMs.put("Asia/Aqtobe", "West Asia Standard Time");
    olsonTimeZoneToMs.put("Asia/Ashgabat", "West Asia Standard Time");
    olsonTimeZoneToMs.put("Asia/Ashkhabad", "West Asia Standard Time");
    olsonTimeZoneToMs.put("Asia/Baghdad", "Arabic Standard Time");
    olsonTimeZoneToMs.put("Asia/Bahrain", "Arab Standard Time");
    olsonTimeZoneToMs.put("Asia/Baku", "Azerbaijan Standard Time");
    olsonTimeZoneToMs.put("Asia/Bangkok", "SE Asia Standard Time");
    olsonTimeZoneToMs.put("Asia/Beirut", "Middle East Standard Time");
    olsonTimeZoneToMs.put("Asia/Bishkek", "Central Asia Standard Time");
    olsonTimeZoneToMs.put("Asia/Brunei", "Singapore Standard Time");
    olsonTimeZoneToMs.put("Asia/Calcutta", "India Standard Time");
    olsonTimeZoneToMs.put("Asia/Chita", "North Asia East Standard Time");
    olsonTimeZoneToMs.put("Asia/Choibalsan", "Ulaanbaatar Standard Time");
    olsonTimeZoneToMs.put("Asia/Chongqing", "China Standard Time");
    olsonTimeZoneToMs.put("Asia/Chungking", "China Standard Time");
    olsonTimeZoneToMs.put("Asia/Colombo", "Sri Lanka Standard Time");
    olsonTimeZoneToMs.put("Asia/Dacca", "Bangladesh Standard Time");
    olsonTimeZoneToMs.put("Asia/Damascus", "Syria Standard Time");
    olsonTimeZoneToMs.put("Asia/Dhaka", "Bangladesh Standard Time");
    olsonTimeZoneToMs.put("Asia/Dili", "Tokyo Standard Time");
    olsonTimeZoneToMs.put("Asia/Dubai", "Arabian Standard Time");
    olsonTimeZoneToMs.put("Asia/Dushanbe", "West Asia Standard Time");
    olsonTimeZoneToMs.put("Asia/Harbin", "China Standard Time");
    olsonTimeZoneToMs.put("Asia/Ho_Chi_Minh", "SE Asia Standard Time");
    olsonTimeZoneToMs.put("Asia/Hong_Kong", "China Standard Time");
    olsonTimeZoneToMs.put("Asia/Hovd", "SE Asia Standard Time");
    olsonTimeZoneToMs.put("Asia/Irkutsk", "North Asia East Standard Time");
    olsonTimeZoneToMs.put("Asia/Istanbul", "Turkey Standard Time");
    olsonTimeZoneToMs.put("Asia/Jakarta", "SE Asia Standard Time");
    olsonTimeZoneToMs.put("Asia/Jayapura", "Tokyo Standard Time");
    olsonTimeZoneToMs.put("Asia/Jerusalem", "Israel Standard Time");
    olsonTimeZoneToMs.put("Asia/Kabul", "Afghanistan Standard Time");
    olsonTimeZoneToMs.put("Asia/Kamchatka", "Russia Time Zone 11");
    olsonTimeZoneToMs.put("Asia/Karachi", "Pakistan Standard Time");
    olsonTimeZoneToMs.put("Asia/Kashgar", "Central Asia Standard Time");
    olsonTimeZoneToMs.put("Asia/Kathmandu", "Nepal Standard Time");
    olsonTimeZoneToMs.put("Asia/Katmandu", "Nepal Standard Time");
    olsonTimeZoneToMs.put("Asia/Khandyga", "Yakutsk Standard Time");
    olsonTimeZoneToMs.put("Asia/Kolkata", "India Standard Time");
    olsonTimeZoneToMs.put("Asia/Krasnoyarsk", "North Asia Standard Time");
    olsonTimeZoneToMs.put("Asia/Kuala_Lumpur", "Singapore Standard Time");
    olsonTimeZoneToMs.put("Asia/Kuching", "Singapore Standard Time");
    olsonTimeZoneToMs.put("Asia/Kuwait", "Arab Standard Time");
    olsonTimeZoneToMs.put("Asia/Macao", "China Standard Time");
    olsonTimeZoneToMs.put("Asia/Macau", "China Standard Time");
    olsonTimeZoneToMs.put("Asia/Magadan", "Magadan Standard Time");
    olsonTimeZoneToMs.put("Asia/Makassar", "Singapore Standard Time");
    olsonTimeZoneToMs.put("Asia/Manila", "Singapore Standard Time");
    olsonTimeZoneToMs.put("Asia/Muscat", "Arabian Standard Time");
    olsonTimeZoneToMs.put("Asia/Nicosia", "GTB Standard Time");
    olsonTimeZoneToMs.put("Asia/Novokuznetsk", "North Asia Standard Time");
    olsonTimeZoneToMs.put("Asia/Novosibirsk", "N. Central Asia Standard Time");
    olsonTimeZoneToMs.put("Asia/Omsk", "N. Central Asia Standard Time");
    olsonTimeZoneToMs.put("Asia/Oral", "West Asia Standard Time");
    olsonTimeZoneToMs.put("Asia/Phnom_Penh", "SE Asia Standard Time");
    olsonTimeZoneToMs.put("Asia/Pontianak", "SE Asia Standard Time");
    olsonTimeZoneToMs.put("Asia/Pyongyang", "Korea Standard Time");
    olsonTimeZoneToMs.put("Asia/Qatar", "Arab Standard Time");
    olsonTimeZoneToMs.put("Asia/Qyzylorda", "Central Asia Standard Time");
    olsonTimeZoneToMs.put("Asia/Rangoon", "Myanmar Standard Time");
    olsonTimeZoneToMs.put("Asia/Riyadh", "Arab Standard Time");
    olsonTimeZoneToMs.put("Asia/Saigon", "SE Asia Standard Time");
    olsonTimeZoneToMs.put("Asia/Sakhalin", "Vladivostok Standard Time");
    olsonTimeZoneToMs.put("Asia/Samarkand", "West Asia Standard Time");
    olsonTimeZoneToMs.put("Asia/Seoul", "Korea Standard Time");
    olsonTimeZoneToMs.put("Asia/Shanghai", "China Standard Time");
    olsonTimeZoneToMs.put("Asia/Singapore", "Singapore Standard Time");
    olsonTimeZoneToMs.put("Asia/Srednekolymsk", "Russia Time Zone 10");
    olsonTimeZoneToMs.put("Asia/Taipei", "Taipei Standard Time");
    olsonTimeZoneToMs.put("Asia/Tashkent", "West Asia Standard Time");
    olsonTimeZoneToMs.put("Asia/Tbilisi", "Georgian Standard Time");
    olsonTimeZoneToMs.put("Asia/Tehran", "Iran Standard Time");
    olsonTimeZoneToMs.put("Asia/Tel_Aviv", "Israel Standard Time");
    olsonTimeZoneToMs.put("Asia/Thimbu", "Bangladesh Standard Time");
    olsonTimeZoneToMs.put("Asia/Thimphu", "Bangladesh Standard Time");
    olsonTimeZoneToMs.put("Asia/Tokyo", "Tokyo Standard Time");
    olsonTimeZoneToMs.put("Asia/Ujung_Pandang", "Singapore Standard Time");
    olsonTimeZoneToMs.put("Asia/Ulaanbaatar", "Ulaanbaatar Standard Time");
    olsonTimeZoneToMs.put("Asia/Ulan_Bator", "Ulaanbaatar Standard Time");
    olsonTimeZoneToMs.put("Asia/Urumqi", "Central Asia Standard Time");
    olsonTimeZoneToMs.put("Asia/Ust-Nera", "Vladivostok Standard Time");
    olsonTimeZoneToMs.put("Asia/Vientiane", "SE Asia Standard Time");
    olsonTimeZoneToMs.put("Asia/Vladivostok", "Vladivostok Standard Time");
    olsonTimeZoneToMs.put("Asia/Yakutsk", "Yakutsk Standard Time");
    olsonTimeZoneToMs.put("Asia/Yekaterinburg", "Ekaterinburg Standard Time");
    olsonTimeZoneToMs.put("Asia/Yerevan", "Caucasus Standard Time");
    olsonTimeZoneToMs.put("Atlantic/Azores", "Azores Standard Time");
    olsonTimeZoneToMs.put("Atlantic/Bermuda", "Atlantic Standard Time");
    olsonTimeZoneToMs.put("Atlantic/Canary", "GMT Standard Time");
    olsonTimeZoneToMs.put("Atlantic/Cape_Verde", "Cape Verde Standard Time");
    olsonTimeZoneToMs.put("Atlantic/Faeroe", "GMT Standard Time");
    olsonTimeZoneToMs.put("Atlantic/Faroe", "GMT Standard Time");
    olsonTimeZoneToMs.put("Atlantic/Jan_Mayen", "W. Europe Standard Time");
    olsonTimeZoneToMs.put("Atlantic/Madeira", "GMT Standard Time");
    olsonTimeZoneToMs.put("Atlantic/Reykjavik", "Greenwich Standard Time");
    olsonTimeZoneToMs.put("Atlantic/South_Georgia", "UTC-02");
    olsonTimeZoneToMs.put("Atlantic/St_Helena", "Greenwich Standard Time");
    olsonTimeZoneToMs.put("Atlantic/Stanley", "SA Eastern Standard Time");
    olsonTimeZoneToMs.put("Australia/ACT", "AUS Eastern Standard Time");
    olsonTimeZoneToMs.put("Australia/Adelaide", "Cen. Australia Standard Time");
    olsonTimeZoneToMs.put("Australia/Brisbane", "E. Australia Standard Time");
    olsonTimeZoneToMs.put("Australia/Broken_Hill", "Cen. Australia Standard Time");
    olsonTimeZoneToMs.put("Australia/Canberra", "AUS Eastern Standard Time");
    olsonTimeZoneToMs.put("Australia/Currie", "Tasmania Standard Time");
    olsonTimeZoneToMs.put("Australia/Darwin", "AUS Central Standard Time");
    olsonTimeZoneToMs.put("Australia/Hobart", "Tasmania Standard Time");
    olsonTimeZoneToMs.put("Australia/Lindeman", "E. Australia Standard Time");
    olsonTimeZoneToMs.put("Australia/Melbourne", "AUS Eastern Standard Time");
    olsonTimeZoneToMs.put("Australia/NSW", "AUS Eastern Standard Time");
    olsonTimeZoneToMs.put("Australia/North", "AUS Central Standard Time");
    olsonTimeZoneToMs.put("Australia/Perth", "W. Australia Standard Time");
    olsonTimeZoneToMs.put("Australia/Queensland", "E. Australia Standard Time");
    olsonTimeZoneToMs.put("Australia/South", "Cen. Australia Standard Time");
    olsonTimeZoneToMs.put("Australia/Sydney", "AUS Eastern Standard Time");
    olsonTimeZoneToMs.put("Australia/Tasmania", "Tasmania Standard Time");
    olsonTimeZoneToMs.put("Australia/Victoria", "AUS Eastern Standard Time");
    olsonTimeZoneToMs.put("Australia/West", "W. Australia Standard Time");
    olsonTimeZoneToMs.put("Australia/Yancowinna", "Cen. Australia Standard Time");
    olsonTimeZoneToMs.put("Brazil/Acre", "SA Pacific Standard Time");
    olsonTimeZoneToMs.put("Brazil/DeNoronha", "UTC-02");
    olsonTimeZoneToMs.put("Brazil/East", "E. South America Standard Time");
    olsonTimeZoneToMs.put("Brazil/West", "SA Western Standard Time");
    olsonTimeZoneToMs.put("CST6CDT", "Central Standard Time");
    olsonTimeZoneToMs.put("Canada/Atlantic", "Atlantic Standard Time");
    olsonTimeZoneToMs.put("Canada/Central", "Central Standard Time");
    olsonTimeZoneToMs.put("Canada/East-Saskatchewan", "Canada Central Standard Time");
    olsonTimeZoneToMs.put("Canada/Eastern", "Eastern Standard Time");
    olsonTimeZoneToMs.put("Canada/Mountain", "Mountain Standard Time");
    olsonTimeZoneToMs.put("Canada/Newfoundland", "Newfoundland Standard Time");
    olsonTimeZoneToMs.put("Canada/Pacific", "Pacific Standard Time");
    olsonTimeZoneToMs.put("Canada/Saskatchewan", "Canada Central Standard Time");
    olsonTimeZoneToMs.put("Canada/Yukon", "Pacific Standard Time");
    olsonTimeZoneToMs.put("Chile/Continental", "Pacific SA Standard Time");
    olsonTimeZoneToMs.put("Cuba", "Eastern Standard Time");
    olsonTimeZoneToMs.put("EST", "SA Pacific Standard Time");
    olsonTimeZoneToMs.put("EST5EDT", "Eastern Standard Time");
    olsonTimeZoneToMs.put("Egypt", "Egypt Standard Time");
    olsonTimeZoneToMs.put("Eire", "GMT Standard Time");
    olsonTimeZoneToMs.put("Etc/GMT", "UTC");
    olsonTimeZoneToMs.put("Etc/GMT+0", "UTC");
    olsonTimeZoneToMs.put("Etc/GMT+1", "Cape Verde Standard Time");
    olsonTimeZoneToMs.put("Etc/GMT+10", "Hawaiian Standard Time");
    olsonTimeZoneToMs.put("Etc/GMT+11", "UTC-11");
    olsonTimeZoneToMs.put("Etc/GMT+12", "Dateline Standard Time");
    olsonTimeZoneToMs.put("Etc/GMT+2", "UTC-02");
    olsonTimeZoneToMs.put("Etc/GMT+3", "SA Eastern Standard Time");
    olsonTimeZoneToMs.put("Etc/GMT+4", "SA Western Standard Time");
    olsonTimeZoneToMs.put("Etc/GMT+5", "SA Pacific Standard Time");
    olsonTimeZoneToMs.put("Etc/GMT+6", "Central America Standard Time");
    olsonTimeZoneToMs.put("Etc/GMT+7", "US Mountain Standard Time");
    olsonTimeZoneToMs.put("Etc/GMT-0", "UTC");
    olsonTimeZoneToMs.put("Etc/GMT-1", "W. Central Africa Standard Time");
    olsonTimeZoneToMs.put("Etc/GMT-10", "West Pacific Standard Time");
    olsonTimeZoneToMs.put("Etc/GMT-11", "Central Pacific Standard Time");
    olsonTimeZoneToMs.put("Etc/GMT-12", "UTC+12");
    olsonTimeZoneToMs.put("Etc/GMT-13", "Tonga Standard Time");
    olsonTimeZoneToMs.put("Etc/GMT-14", "Line Islands Standard Time");
    olsonTimeZoneToMs.put("Etc/GMT-2", "South Africa Standard Time");
    olsonTimeZoneToMs.put("Etc/GMT-3", "E. Africa Standard Time");
    olsonTimeZoneToMs.put("Etc/GMT-4", "Arabian Standard Time");
    olsonTimeZoneToMs.put("Etc/GMT-5", "West Asia Standard Time");
    olsonTimeZoneToMs.put("Etc/GMT-6", "Central Asia Standard Time");
    olsonTimeZoneToMs.put("Etc/GMT-7", "SE Asia Standard Time");
    olsonTimeZoneToMs.put("Etc/GMT-8", "Singapore Standard Time");
    olsonTimeZoneToMs.put("Etc/GMT-9", "Tokyo Standard Time");
    olsonTimeZoneToMs.put("Etc/GMT0", "UTC");
    olsonTimeZoneToMs.put("Etc/Greenwich", "UTC");
    olsonTimeZoneToMs.put("Etc/UCT", "UTC");
    olsonTimeZoneToMs.put("Etc/UTC", "UTC");
    olsonTimeZoneToMs.put("Etc/Universal", "UTC");
    olsonTimeZoneToMs.put("Etc/Zulu", "UTC");
    olsonTimeZoneToMs.put("Europe/Amsterdam", "W. Europe Standard Time");
    olsonTimeZoneToMs.put("Europe/Andorra", "W. Europe Standard Time");
    olsonTimeZoneToMs.put("Europe/Athens", "GTB Standard Time");
    olsonTimeZoneToMs.put("Europe/Belfast", "GMT Standard Time");
    olsonTimeZoneToMs.put("Europe/Belgrade", "Central Europe Standard Time");
    olsonTimeZoneToMs.put("Europe/Berlin", "W. Europe Standard Time");
    olsonTimeZoneToMs.put("Europe/Bratislava", "Central Europe Standard Time");
    olsonTimeZoneToMs.put("Europe/Brussels", "Romance Standard Time");
    olsonTimeZoneToMs.put("Europe/Bucharest", "GTB Standard Time");
    olsonTimeZoneToMs.put("Europe/Budapest", "Central Europe Standard Time");
    olsonTimeZoneToMs.put("Europe/Busingen", "W. Europe Standard Time");
    olsonTimeZoneToMs.put("Europe/Chisinau", "GTB Standard Time");
    olsonTimeZoneToMs.put("Europe/Copenhagen", "Romance Standard Time");
    olsonTimeZoneToMs.put("Europe/Dublin", "GMT Standard Time");
    olsonTimeZoneToMs.put("Europe/Gibraltar", "W. Europe Standard Time");
    olsonTimeZoneToMs.put("Europe/Guernsey", "GMT Standard Time");
    olsonTimeZoneToMs.put("Europe/Helsinki", "FLE Standard Time");
    olsonTimeZoneToMs.put("Europe/Isle_of_Man", "GMT Standard Time");
    olsonTimeZoneToMs.put("Europe/Istanbul", "Turkey Standard Time");
    olsonTimeZoneToMs.put("Europe/Jersey", "GMT Standard Time");
    olsonTimeZoneToMs.put("Europe/Kaliningrad", "Kaliningrad Standard Time");
    olsonTimeZoneToMs.put("Europe/Kiev", "FLE Standard Time");
    olsonTimeZoneToMs.put("Europe/Lisbon", "GMT Standard Time");
    olsonTimeZoneToMs.put("Europe/Ljubljana", "Central Europe Standard Time");
    olsonTimeZoneToMs.put("Europe/London", "GMT Standard Time");
    olsonTimeZoneToMs.put("Europe/Luxembourg", "W. Europe Standard Time");
    olsonTimeZoneToMs.put("Europe/Madrid", "Romance Standard Time");
    olsonTimeZoneToMs.put("Europe/Malta", "W. Europe Standard Time");
    olsonTimeZoneToMs.put("Europe/Mariehamn", "FLE Standard Time");
    olsonTimeZoneToMs.put("Europe/Minsk", "Belarus Standard Time");
    olsonTimeZoneToMs.put("Europe/Monaco", "W. Europe Standard Time");
    olsonTimeZoneToMs.put("Europe/Moscow", "Russian Standard Time");
    olsonTimeZoneToMs.put("Europe/Nicosia", "GTB Standard Time");
    olsonTimeZoneToMs.put("Europe/Oslo", "W. Europe Standard Time");
    olsonTimeZoneToMs.put("Europe/Paris", "Romance Standard Time");
    olsonTimeZoneToMs.put("Europe/Podgorica", "Central Europe Standard Time");
    olsonTimeZoneToMs.put("Europe/Prague", "Central Europe Standard Time");
    olsonTimeZoneToMs.put("Europe/Riga", "FLE Standard Time");
    olsonTimeZoneToMs.put("Europe/Rome", "W. Europe Standard Time");
    olsonTimeZoneToMs.put("Europe/Samara", "Russia Time Zone 3");
    olsonTimeZoneToMs.put("Europe/San_Marino", "W. Europe Standard Time");
    olsonTimeZoneToMs.put("Europe/Sarajevo", "Central European Standard Time");
    olsonTimeZoneToMs.put("Europe/Simferopol", "Russian Standard Time");
    olsonTimeZoneToMs.put("Europe/Skopje", "Central European Standard Time");
    olsonTimeZoneToMs.put("Europe/Sofia", "FLE Standard Time");
    olsonTimeZoneToMs.put("Europe/Stockholm", "W. Europe Standard Time");
    olsonTimeZoneToMs.put("Europe/Tallinn", "FLE Standard Time");
    olsonTimeZoneToMs.put("Europe/Tirane", "Central Europe Standard Time");
    olsonTimeZoneToMs.put("Europe/Tiraspol", "GTB Standard Time");
    olsonTimeZoneToMs.put("Europe/Uzhgorod", "FLE Standard Time");
    olsonTimeZoneToMs.put("Europe/Vaduz", "W. Europe Standard Time");
    olsonTimeZoneToMs.put("Europe/Vatican", "W. Europe Standard Time");
    olsonTimeZoneToMs.put("Europe/Vienna", "W. Europe Standard Time");
    olsonTimeZoneToMs.put("Europe/Vilnius", "FLE Standard Time");
    olsonTimeZoneToMs.put("Europe/Volgograd", "Russian Standard Time");
    olsonTimeZoneToMs.put("Europe/Warsaw", "Central European Standard Time");
    olsonTimeZoneToMs.put("Europe/Zagreb", "Central European Standard Time");
    olsonTimeZoneToMs.put("Europe/Zaporozhye", "FLE Standard Time");
    olsonTimeZoneToMs.put("Europe/Zurich", "W. Europe Standard Time");
    olsonTimeZoneToMs.put("GB", "GMT Standard Time");
    olsonTimeZoneToMs.put("GB-Eire", "GMT Standard Time");
    olsonTimeZoneToMs.put("GMT", "UTC");
    olsonTimeZoneToMs.put("GMT+0", "UTC");
    olsonTimeZoneToMs.put("GMT-0", "UTC");
    olsonTimeZoneToMs.put("GMT0", "UTC");
    olsonTimeZoneToMs.put("Greenwich", "UTC");
    olsonTimeZoneToMs.put("HST", "Hawaiian Standard Time");
    olsonTimeZoneToMs.put("Hongkong", "China Standard Time");
    olsonTimeZoneToMs.put("Iceland", "Greenwich Standard Time");
    olsonTimeZoneToMs.put("Indian/Antananarivo", "E. Africa Standard Time");
    olsonTimeZoneToMs.put("Indian/Chagos", "Central Asia Standard Time");
    olsonTimeZoneToMs.put("Indian/Christmas", "SE Asia Standard Time");
    olsonTimeZoneToMs.put("Indian/Cocos", "Myanmar Standard Time");
    olsonTimeZoneToMs.put("Indian/Comoro", "E. Africa Standard Time");
    olsonTimeZoneToMs.put("Indian/Kerguelen", "West Asia Standard Time");
    olsonTimeZoneToMs.put("Indian/Mahe", "Mauritius Standard Time");
    olsonTimeZoneToMs.put("Indian/Maldives", "West Asia Standard Time");
    olsonTimeZoneToMs.put("Indian/Mauritius", "Mauritius Standard Time");
    olsonTimeZoneToMs.put("Indian/Mayotte", "E. Africa Standard Time");
    olsonTimeZoneToMs.put("Indian/Reunion", "Mauritius Standard Time");
    olsonTimeZoneToMs.put("Iran", "Iran Standard Time");
    olsonTimeZoneToMs.put("Israel", "Israel Standard Time");
    olsonTimeZoneToMs.put("Jamaica", "SA Pacific Standard Time");
    olsonTimeZoneToMs.put("Japan", "Tokyo Standard Time");
    olsonTimeZoneToMs.put("Kwajalein", "UTC+12");
    olsonTimeZoneToMs.put("Libya", "Libya Standard Time");
    olsonTimeZoneToMs.put("MST", "US Mountain Standard Time");
    olsonTimeZoneToMs.put("MST7MDT", "Mountain Standard Time");
    olsonTimeZoneToMs.put("Mexico/BajaNorte", "Pacific Standard Time");
    olsonTimeZoneToMs.put("Mexico/BajaSur", "Mountain Standard Time (Mexico)");
    olsonTimeZoneToMs.put("Mexico/General", "Central Standard Time (Mexico)");
    olsonTimeZoneToMs.put("NZ", "New Zealand Standard Time");
    olsonTimeZoneToMs.put("Navajo", "Mountain Standard Time");
    olsonTimeZoneToMs.put("PRC", "China Standard Time");
    olsonTimeZoneToMs.put("PST8PDT", "Pacific Standard Time");
    olsonTimeZoneToMs.put("Pacific/Apia", "Samoa Standard Time");
    olsonTimeZoneToMs.put("Pacific/Auckland", "New Zealand Standard Time");
    olsonTimeZoneToMs.put("Pacific/Bougainville", "Central Pacific Standard Time");
    olsonTimeZoneToMs.put("Pacific/Chuuk", "West Pacific Standard Time");
    olsonTimeZoneToMs.put("Pacific/Efate", "Central Pacific Standard Time");
    olsonTimeZoneToMs.put("Pacific/Enderbury", "Tonga Standard Time");
    olsonTimeZoneToMs.put("Pacific/Fakaofo", "Tonga Standard Time");
    olsonTimeZoneToMs.put("Pacific/Fiji", "Fiji Standard Time");
    olsonTimeZoneToMs.put("Pacific/Funafuti", "UTC+12");
    olsonTimeZoneToMs.put("Pacific/Galapagos", "Central America Standard Time");
    olsonTimeZoneToMs.put("Pacific/Guadalcanal", "Central Pacific Standard Time");
    olsonTimeZoneToMs.put("Pacific/Guam", "West Pacific Standard Time");
    olsonTimeZoneToMs.put("Pacific/Honolulu", "Hawaiian Standard Time");
    olsonTimeZoneToMs.put("Pacific/Johnston", "Hawaiian Standard Time");
    olsonTimeZoneToMs.put("Pacific/Kiritimati", "Line Islands Standard Time");
    olsonTimeZoneToMs.put("Pacific/Kosrae", "Central Pacific Standard Time");
    olsonTimeZoneToMs.put("Pacific/Kwajalein", "UTC+12");
    olsonTimeZoneToMs.put("Pacific/Majuro", "UTC+12");
    olsonTimeZoneToMs.put("Pacific/Midway", "UTC-11");
    olsonTimeZoneToMs.put("Pacific/Nauru", "UTC+12");
    olsonTimeZoneToMs.put("Pacific/Niue", "UTC-11");
    olsonTimeZoneToMs.put("Pacific/Noumea", "Central Pacific Standard Time");
    olsonTimeZoneToMs.put("Pacific/Pago_Pago", "UTC-11");
    olsonTimeZoneToMs.put("Pacific/Palau", "Tokyo Standard Time");
    olsonTimeZoneToMs.put("Pacific/Pohnpei", "Central Pacific Standard Time");
    olsonTimeZoneToMs.put("Pacific/Ponape", "Central Pacific Standard Time");
    olsonTimeZoneToMs.put("Pacific/Port_Moresby", "West Pacific Standard Time");
    olsonTimeZoneToMs.put("Pacific/Rarotonga", "Hawaiian Standard Time");
    olsonTimeZoneToMs.put("Pacific/Saipan", "West Pacific Standard Time");
    olsonTimeZoneToMs.put("Pacific/Samoa", "UTC-11");
    olsonTimeZoneToMs.put("Pacific/Tahiti", "Hawaiian Standard Time");
    olsonTimeZoneToMs.put("Pacific/Tarawa", "UTC+12");
    olsonTimeZoneToMs.put("Pacific/Tongatapu", "Tonga Standard Time");
    olsonTimeZoneToMs.put("Pacific/Truk", "West Pacific Standard Time");
    olsonTimeZoneToMs.put("Pacific/Wake", "UTC+12");
    olsonTimeZoneToMs.put("Pacific/Wallis", "UTC+12");
    olsonTimeZoneToMs.put("Pacific/Yap", "West Pacific Standard Time");
    olsonTimeZoneToMs.put("Poland", "Central European Standard Time");
    olsonTimeZoneToMs.put("Portugal", "GMT Standard Time");
    olsonTimeZoneToMs.put("ROC", "Taipei Standard Time");
    olsonTimeZoneToMs.put("ROK", "Korea Standard Time");
    olsonTimeZoneToMs.put("Singapore", "Singapore Standard Time");
    olsonTimeZoneToMs.put("Turkey", "Turkey Standard Time");
    olsonTimeZoneToMs.put("UCT", "UTC");
    olsonTimeZoneToMs.put("US/Alaska", "Alaskan Standard Time");
    olsonTimeZoneToMs.put("US/Arizona", "US Mountain Standard Time");
    olsonTimeZoneToMs.put("US/Central", "Central Standard Time");
    olsonTimeZoneToMs.put("US/East-Indiana", "US Eastern Standard Time");
    olsonTimeZoneToMs.put("US/Eastern", "Eastern Standard Time");
    olsonTimeZoneToMs.put("US/Hawaii", "Hawaiian Standard Time");
    olsonTimeZoneToMs.put("US/Indiana-Starke", "Central Standard Time");
    olsonTimeZoneToMs.put("US/Michigan", "Eastern Standard Time");
    olsonTimeZoneToMs.put("US/Mountain", "Mountain Standard Time");
    olsonTimeZoneToMs.put("US/Pacific", "Pacific Standard Time");
    olsonTimeZoneToMs.put("US/Pacific-New", "Pacific Standard Time");
    olsonTimeZoneToMs.put("US/Samoa", "UTC-11");
    olsonTimeZoneToMs.put("UTC", "UTC");
    olsonTimeZoneToMs.put("Universal", "UTC");
    olsonTimeZoneToMs.put("W-SU", "Russian Standard Time");
    olsonTimeZoneToMs.put("Zulu", "UTC");
    //additions outside of Unicode list
    olsonTimeZoneToMs.put("America/Adak", "Hawaiian Standard Time,(UTC-10:00) Hawaii");
    olsonTimeZoneToMs.put("America/Atka", "Hawaiian Standard Time,(UTC-10:00) Hawaii");
    olsonTimeZoneToMs.put("America/Metlakatla", "Pacific Standard Time");
    olsonTimeZoneToMs.put("America/Miquelon", "South America Standard Time");
    olsonTimeZoneToMs.put("Asia/Gaza", "Middle East Standard Time");
  }

  /**
   * Convert Olson TimeZone to Microsoft TimeZone Generated using Unicode CLDR project Example:
   * https://gist.github.com/scottmac/655675e9b4d4913c539c
   *
   * @param timeZone java timezone (Olson)
   * @return a microsoft timezone identifier (ala Eastern Standard Time)
   */
  public static String getMicrosoftTimeZoneName(TimeZone timeZone) {
    return olsonTimeZoneToMs.get(timeZone.getID());
  }
  
  /**
   * Search for TimeZoneDefinition from either Olson time zone definitions or Microsoft list.
   * 
   * @param timeZoneId time zone identifier, either Olson or Microsoft
   * @return Microsoft time zone definition, null if definition not found.
   */
  public static TimeZoneDefinition findSystemTimeZoneById(String timeZoneId) {
    // find time zone definition according to Java definitions
    if (olsonTimeZoneToMs.containsKey(timeZoneId)) {
      TimeZone javaTz = TimeZone.getTimeZone(timeZoneId);
      return new OlsonTimeZoneDefinition(javaTz);
    }
    else if (timeZoneId != null && !timeZoneId.isEmpty()) {
      // try finding timeZone id in the Microsoft values list
      for (Entry<String, String> pair : olsonTimeZoneToMs.entrySet()) {
        if (pair.getValue().equals(timeZoneId)) {
          TimeZone javaTz = TimeZone.getTimeZone(pair.getKey());
          return new OlsonTimeZoneDefinition(javaTz);
        }
      }
    }
    // null if it has no matching entry at all
    return null;  
  }
  


}
