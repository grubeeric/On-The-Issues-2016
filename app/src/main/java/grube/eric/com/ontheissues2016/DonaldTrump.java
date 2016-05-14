package grube.eric.com.ontheissues2016;

import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.transition.Explode;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DonaldTrump extends AppCompatActivity {
    ExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(Build.VERSION.SDK_INT>=21){
            Explode explode = new Explode();
            explode.setDuration(1000);
            getWindow().setEnterTransition(explode);
        }
        setContentView(R.layout.activity_donald_trump);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //get the listview
        expListView = (ExpandableListView) findViewById(R.id.lvDon);

        //preparing list data
        prepareListData();

        listAdapter = new ExpandableListAdapter(this, listDataHeader, listDataChild);

        //setting list adapter
        expListView.setAdapter(listAdapter);
    }

    //Preparing the list data
    private void prepareListData(){
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();

        //Array stores the header titles
        String[] topics = {"Abortion", "Budget and Economy", "Civil Rights", "Corporations", "Crime", "Drugs", "Education", "Energy and Oil", "Enviornment", "Foreign Policy", "Free Trade", "Gun Control", "Health Care",
                "Immigration", "Jobs", "Social Security", "Tax Reform", "Technology", "War and Peace", "Welfare and Poverty"};

        //Adding header data
        for(int i = 0; i < topics.length; i++){
            listDataHeader.add(topics[i]);
        }

        //Adding child data
        List<String> abortion = new ArrayList<>();
        abortion.add("I have evolved on abortion issue, like Reagan evolved. (Aug 2015)");
        abortion.add("Ban late abortions; exceptions for rape, incest or health. (Jun 2015)");
        abortion.add("I am now pro-life; after years of being pro-choice. (Apr 2011)");
        abortion.add("I changed my views to pro-life based on personal stories. (Apr 2011)");
        abortion.add("I am pro-life; fight ObamaCare abortion funding. (Feb 2011)");
        abortion.add("Pro-choice, but ban partial birth abortion. (Jul 2000)");
        abortion.add("Favors abortion rights but respects opposition. (Dec 1999)");



        List<String> economy = new ArrayList<>();
        economy.add("We owe $19T and we need a businessman to bring us back. (Sep 2015)");
        economy.add("If debt reaches $24T, that's the point of no return. (Jun 2015)");
        economy.add("We prospered after 9/11; we'll prosper after Great Recession. (Apr 2010)");
        economy.add("2006: Warned about impending implosion of financial sector. (Apr 2010)");
        economy.add("Prepare for upcoming crash, bigger than 1929. (Jul 2000)");
        economy.add("Optimistic about future of Atlantic City. (Jul 1990)");
        economy.add("Rent control only benefits a privileged minority. (Jul 1987)");
        economy.add("One-time 14.25% tax on wealth, to erase national debt. (Nov 1999)");
        economy.add("Predicts 35% boost to economy from eliminating national debt. (Nov 1999)");



        List<String> civilRights = new ArrayList<>();
        civilRights.add("Disinvited from RedState gathering for misogynistic comments. (Aug 2015)");
        civilRights.add("Political correctness is country's problem, not my problem. (Aug 2015)");
        civilRights.add("Same-sex marriage is a state issue. (Jun 2015)");
        civilRights.add("No gay marriage; no same-sex partner benefits. (Mar 2011)");
        civilRights.add("Tolerate diversity; prosecute hate crimes against gays. (Jul 2000)");



        List<String> corporations = new ArrayList<>();
        corporations.add("I've used bankruptcy laws to do a great job for my companies. (Aug 2015)");
        corporations.add("2002: Participated in development boom of Jersey City. (Apr 2012)");
        corporations.add("0% corporate tax would create millions of jobs. (Dec 2011)");
        corporations.add("Fight crony capitalism with a level playing field. (Dec 2011)");
        corporations.add("Wealthy move assets around globally based on tax incentives. (Apr 2011)");
        corporations.add("Business is an acquired skill based on discipline & focus. (Apr 2010)");
        corporations.add("Pragmatic positive: be positive, but be realistic. (Apr 2010)");
        corporations.add("Being a know-it-all shuts the door on new ideas. (Apr 2010)");



        List<String> crime = new ArrayList<>();
        crime.add("Capital punishment isn’t uncivilized; murderers living is. (Jul 2000)");
        crime.add("Death penalty deters like violent TV leads kids astray. (Jul 2000)");
        crime.add("Hold judges accountable; don’t reduce sentences. (Jul 2000)");
        crime.add("For tough anti-crime policies; not criminals’ rights. (Jul 2000)");



        List<String> drugs = new ArrayList<>();
        drugs.add("Legalize drugs and use tax revenue to fund drug education. (Apr 2011)");
        drugs.add("Never drinks, smokes, nor does drugs. (Feb 2011)");
        drugs.add("Fired Miss USA crown winner due to drug over-indulgence. (Dec 2006)");
        drugs.add("Never touched drugs, nor alcohol, tobacco, or coffee. (Jul 2000)");



        List<String> education = new ArrayList<>();
        education.add("Common Core is a disaster. (Jun 2015)");
        education.add("Cut the Department of Education way, way down. (Jun 2015)");
        education.add("Founded Trump University to teach the art of deal-making. (Jun 2015)");
        education.add("Opposes Common Core. (Feb 2015)");
        education.add("Americans don't know their roots: study your ancestry. (Apr 2010)");
        education.add("Comprehensive education instead of limiting subjects. (Apr 2010)");
        education.add("Teach citizenship; stop “dumbing down”. (Jul 2000)");
        education.add("End “creative spelling,” “estimating,” & “empowerment”. (Jul 2000)");
        education.add("Bring on the competition; tear down the union walls. (Jul 2000)");
        education.add("School choice will improve public schools. (Jul 2000)");



        List<String> energy = new ArrayList<>();
        energy.add("Climate change is a hoax. (Jun 2015)");
        energy.add("No Cap-and-Tax: oil is this country's lifeblood. (Dec 2011)");
        energy.add("Jobs will slump until our lifeblood--oil--is cheap again. (Dec 2011)");
        energy.add("Enough natural gas in Marcellus Shale for 110 year supply. (Dec 2011)");
        energy.add("Libya: No oil, no support; no exceptions. (Dec 2011)");
        energy.add("It's incredible how slowly we're drilling for oil. (Mar 2011)");
        energy.add("Oil is the lifeblood of all economies. (Apr 2010)");



        List<String> enviornment = new ArrayList<>();
        enviornment.add("Partner with environmentalists when undertaking projects. (Apr 2010)");
        enviornment.add("Good development enhances the environment. (Jan 2008)");
        enviornment.add("FactCheck: Yes, hybrid family vehicles are available in US. ()");



        List<String> foreignPolicy = new ArrayList<>();
        foreignPolicy.add("Putin has no respect for America; I will get along with him. (Sep 2015)");
        foreignPolicy.add("We must deal with the maniac in North Korea with nukes. (Sep 2015)");
        foreignPolicy.add("More sanctions on Iran; more support of Israel. (Jun 2015)");
        foreignPolicy.add("China is our enemy; they're bilking us for billions. (Dec 2011)");
        foreignPolicy.add("When you love America, you protect it with no apologies. (Dec 2011)");
        foreignPolicy.add("By 2027, tsunami as China overtakes US as largest economy. (Dec 2011)");
        foreignPolicy.add("Things change; empires come and go. (Apr 2010)");
        foreignPolicy.add("Criticized Buchanan’s view on Hitler as appeasement. (Jul 2000)");
        foreignPolicy.add("Post-Cold War: switch from chess player to dealmaker. (Jul 2000)");
        foreignPolicy.add("Support Russia, but with strings attached. (Jul 2000)");
        foreignPolicy.add("China: lack of human rights prevents consumer development. (Jul 2000)");
        foreignPolicy.add("Be tougher on China-we’re too eager to please. (Jul 2000)");



        List<String> trade = new ArrayList<>();
        trade.add("We don't beat China or Japan or Mexico in trade. (Aug 2015)");
        trade.add("China and Japan are beating us; I can beat China. (Jun 2015)");
        trade.add("35% import tax on Mexican border. (Jun 2015)");
        trade.add("Stupid people negotiate our trade bills, & trade won't work. (Jun 2015)");
        trade.add("20% tax on all imported goods. (Dec 2011)");
        trade.add("Fair trade instead of embarrassing deal with South Korea. (Dec 2011)");
        trade.add("Repatriate jobs that China has been stealing. (Dec 2011)");
        trade.add("Embrace globalization and international markets. (Jan 2008)");
        trade.add("Renegotiate tougher & fairer trade agreements. (Jul 2000)");
        trade.add("President should be nation’s trade representative. (Dec 1999)");
        trade.add("World views US trade officials as ‘saps’. (Dec 1999)");



        List<String> guns = new ArrayList<>();
        guns.add("A very strong person on the Second Amendment. (Jun 2015)");
        guns.add("I am against gun control. (Feb 2011)");
        guns.add("Dems and Reps are both wrong on guns. (Jul 2000)");
        guns.add("For assault weapon ban, waiting period, & background check. (Jul 2000)");



        List<String> healthCare = new ArrayList<>();
        healthCare.add("I'm for vaccines, but in smaller quantities to avoid autism. (Sep 2015)");
        healthCare.add("The insurance companies have total control over politicians. (Aug 2015)");
        healthCare.add("ObamaCare is a catastrophe that must be repealed & replaced. (Jun 2015)");
        healthCare.add("Don't cut Medicare; grow the economy to keep benefits. (Jun 2015)");
        healthCare.add("ObamaCare deductibles are so high that it's useless. (Jun 2015)");
        healthCare.add("Save Medicare & Medicaid without cutting them to the bone. (Jan 2015)");
        healthCare.add("Kill ObamaCare before it becomes a trillion-ton weight. (Dec 2011)");
        healthCare.add("Increase insurance competition across state lines. (Dec 2011)");
        healthCare.add("1988: Flew sick kids cross-country on his private jet. (Apr 2010)");
        healthCare.add("We must have universal health care. (Jul 2000)");



        List<String> immigration = new ArrayList<>();
        immigration.add("We're only country dumb enough for birthright citizenship. (Sep 2015)");
        immigration.add("Illegal immigrants populate many criminal gangs. (Sep 2015)");
        immigration.add("This is a country where we speak English, not Spanish. (Sep 2015)");
        immigration.add("We need wall on Mexican border, but ok to have a door in it. (Aug 2015)");
        immigration.add("Mexican government is sending criminals across the border. (Aug 2015)");
        immigration.add("OpEd: businesses & Republicans condemn anti-Mexico terms. (Jul 2015)");
        immigration.add("Half of the undocumented residents in America are criminals. (Jun 2015)");
        immigration.add("Mexico & Latin America send us drugs, crime, and rapists. (Jun 2015)");
        immigration.add("Build great wall on southern border; have Mexico pay for it. (Jun 2015)");
        immigration.add("We need strong borders; we need a wall. (Feb 2015)");
        immigration.add("Citizenship for illegal immigrants is a GOP suicide mission. (Mar 2013)");
        immigration.add("351,000 illegal aliens are in our prisons; costing $1.1B. (Dec 2011)");
        immigration.add("Anchor babies were NEVER the intent of the 14th Amendment. (Dec 2011)");
        immigration.add("Invite foreigners graduating from college to stay in US. (Dec 2011)");
        immigration.add("Triple-layered fence & Predator drones on Mexican border. (Dec 2011)");
        immigration.add("Control borders; even legal immigration should be difficult. (Jul 2000)");
        immigration.add("Limit new immigration; focus on people already here. (Dec 1999)");



        List<String> jobs = new ArrayList<>();
        jobs.add("Real unemployment rate is 20%; don't believe 5.6%. (Jun 2015)");
        jobs.add("Raising business tax causes businesses to move jobs overseas. (Dec 2011)");
        jobs.add("Unions fight for pay; managers fight for less; consumers win. (Jul 2000)");
        jobs.add("Foreign companies are taking jobs from US. (Dec 1999)");



        List<String> socialSecurity = new ArrayList<>();
        socialSecurity.add("I'll give up my Social Security; leave it to each person. (Sep 2015)");
        socialSecurity.add("Cannot change Medicare or Soc.Sec. and still win elections. (Mar 2013)");
        socialSecurity.add("Social Security isn't an 'entitlement'; it's honoring a deal. (Dec 2011)");
        socialSecurity.add("Disability Racket: $25B in fraudulent disability filings. (Dec 2011)");
        socialSecurity.add("Pay off debt; put $3T interest savings into Trust Fund. (Jul 2000)");
        socialSecurity.add("Let people invest their own retirement funds. (Jul 2000)");
        socialSecurity.add("No government investment of retirement funds. (Jul 2000)");



        List<String> tax = new ArrayList<>();
        tax.add("Raise graduated taxes on hedge fund managers. (Sep 2015)");
        tax.add("One-time 14% tax on wealthy to pay down national debt. (Jun 2015)");
        tax.add("4 brackets; 1-5-10-15%; kill death tax & corporate tax. (Dec 2011)");
        tax.add("Cutting tax rates incentivizes a strong national work ethic. (Dec 2011)");
        tax.add("Previously supported wealth tax; now supports Bush tax cuts. (Apr 2011)");
        tax.add("Repeal the inheritance tax to offset one-time wealth tax. (Jul 2000)");
        tax.add("Simplify tax code; end marriage penalty & other hidden taxes. (Jul 2000)");
        tax.add("Opposes flat tax; benefits wealthy too much. (Jul 2000)");
        tax.add("Personally avoids sales tax, but knows many people like it. (Dec 1999)");
        tax.add("One-time 14.25% tax on wealth, to erase national debt. (Nov 1999)");
        tax.add("Tax assets over $10 million, paid over 10 years. (Nov 1999)");



        List<String> technology = new ArrayList<>();
        technology.add("Rebuild our infrastructure on time & on budget. (Jun 2015)");
        technology.add("Emmy award & Hollywood Walk of Fame for 'The Apprentice'. (Jun 2015)");
        technology.add("China threatens US with cyber warfare & industrial espionage. (Dec 2011)");
        technology.add("Took chance by starting Clear Channel radio program. (Apr 2010)");



        List<String> war = new ArrayList<>();
        war.add("I'm pro-military but I opposed invading Iraq in 2003. (Sep 2015)");
        war.add("If Obama had attacked Syria, we wouldn't have refugees now. (Sep 2015)");
        war.add("Opposed Iraq war in 2004 & predicted Mideast destabilization. (Aug 2015)");
        war.add("Disgraceful deal gives Iran a lot & gets nothing for us. (Aug 2015)");
        war.add("Boots on the ground to fight ISIS. (Jun 2015)");
        war.add("'I said 'don't hit Iraq, because it destabilized Middle East.' (Jun 2015)");
        war.add("Hit ISIS hard and fast. (Feb 2015)");
        war.add("Take $1.5T in oil from Iraq to pay for US victims. (Mar 2013)");
        war.add("Iraq should pick up the tab for their own liberation. (Dec 2011)");
        war.add("Stop Iran's nuclear programs by any & all means necessary. (Dec 2011)");
        war.add("John McCain's actions in Vietnam were not 'heroic'. (Sep 2000)");
        war.add("Use force to stop North Korean nuke development. (Jul 2000)");
        war.add("Support Israel, our unsinkable Mideast aircraft carrier. (Jul 2000)");
        war.add("No humanitarian intervention; only to direct threats. (Jul 2000)");



        List<String> welfare = new ArrayList<>();
        welfare.add("I don't like firing people; work makes people better. (Dec 2011)");
        welfare.add("Food stamps should be temporary; not a decade on the dole. (Dec 2011)");
        welfare.add("Apply welfare-to-work to 76 other welfare programs. (Dec 2011)");
        welfare.add("Let “saints” help teen moms; restrict public assistance. (Jul 2000)");



        //Header, child data for the put
        listDataChild.put(listDataHeader.get(0), abortion);
        listDataChild.put(listDataHeader.get(1), economy);
        listDataChild.put(listDataHeader.get(2), civilRights);
        listDataChild.put(listDataHeader.get(3), corporations);
        listDataChild.put(listDataHeader.get(4), crime);
        listDataChild.put(listDataHeader.get(5), drugs);
        listDataChild.put(listDataHeader.get(6), education);
        listDataChild.put(listDataHeader.get(7), energy);
        listDataChild.put(listDataHeader.get(8), enviornment);
        listDataChild.put(listDataHeader.get(9), foreignPolicy);
        listDataChild.put(listDataHeader.get(10), trade);
        listDataChild.put(listDataHeader.get(11), guns);
        listDataChild.put(listDataHeader.get(12), healthCare);
        listDataChild.put(listDataHeader.get(13), immigration);
        listDataChild.put(listDataHeader.get(14), jobs);
        listDataChild.put(listDataHeader.get(15), socialSecurity);
        listDataChild.put(listDataHeader.get(16), tax);
        listDataChild.put(listDataHeader.get(17), technology);
        listDataChild.put(listDataHeader.get(18), war);
        listDataChild.put(listDataHeader.get(19), welfare);
    }
}
