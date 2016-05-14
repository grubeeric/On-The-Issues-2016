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

public class BenCarson extends AppCompatActivity {
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
        setContentView(R.layout.activity_ben_carson);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //get the listview
        expListView = (ExpandableListView) findViewById(R.id.lvBen);

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
        abortion.add("Ban abortion more than 20 weeks after fertilization. (May 2015)");
        abortion.add("No abortion for convenience. (Jan 2014)");
        abortion.add("The thought of abortion for convenience is repugnant. (Jan 2014)");
        abortion.add("Persuaded mother of hydrocephalic baby to cancel abortion. (Jan 2012)");



        List<String> economy = new ArrayList<>();
        economy.add("Let the economy work the way it's supposed to. (Jan 2014)");
        economy.add("The free market works. (Jan 2014)");
        economy.add("1990s deregulation paved way for 2008 economic meltdown. (Jan 2012)");
        economy.add("Cut every agency spending by 10%, with no exceptions. (Jan 2012)");



        List<String> civilRights = new ArrayList<>();
        civilRights.add("Homosexuality is a choice, but same-sex marriage is the law. (May 2015)");
        civilRights.add("Give gays rights, but not marriage, because it's a choice. (Mar 2015)");
        civilRights.add("Don't let the PC police label conservatives as extremists. (Feb 2015)");
        civilRights.add("Underdog status is not determined any longer by race. (Feb 2014)");
        civilRights.add("Underdog status is no longer determined by race. (Feb 2014)");
        civilRights.add("Apologized for likening homosexuality to pedophilia. (Mar 2013)");
        civilRights.add("Marriage should not be extended to same-sex couples. (Mar 2013)");
        civilRights.add("1960s: experienced racism in inner-city Boston and Detroit. (Jan 2012)");
        civilRights.add("Reparations for WWII Japanese ok, but not for slavery. (Jan 2012)");
        civilRights.add("Not all black candidates share Obama's left-wing politics. (Jan 2012)");
        civilRights.add("Redefining marriage is slippery slope with disastrous ending. (Jan 2012)");
        civilRights.add("Legal binding relationship for gays to enjoy property rights. (Jan 2012)");
        civilRights.add("Free speech is wonderful, but hate speech causes actual harm. (Jan 2012)");



        List<String> corporations = new ArrayList<>();
        corporations.add("Tithing teaches about not hoarding as capitalist greed. (Jan 2012)");
        corporations.add("Highest corporate tax rate causes highest national debt. (Jan 2012)");



        List<String> crime = new ArrayList<>();
        crime.add("Arrests for 'Driving While Black' is common. (Nov 2014)");
        crime.add("Equip police with body cameras to avoid abusiveness. (Nov 2014)");
        crime.add("Develop inner city resources to build alternatives to crime. (Aug 2014)");
        crime.add("On Trayvon: It's not a perfect system, but is best we have. (Jul 2013)");
        crime.add("On 'Stand Your Ground': Turn down the rhetoric. (Jul 2013)");
        crime.add("Imagine the mayhem if all police protection were removed. (Jan 2012)");
        crime.add("Motorcyclists not wearing helmets consume medical resources. (Jan 2012)");
        crime.add("Excessive litigation would end with 'loser pays' arrangement. (Jan 2012)");
        crime.add("Stop politically-correct prejudice against blacks vs. whites. (Jan 2012)");



        List<String> drugs = new ArrayList<>();
        drugs.add("Marijuana for medical use, but not for recreational use. (Jan 2014)");
        drugs.add("Religion kept me away from 1960s sex and drugs. (Jan 2012)");
        drugs.add("Reducing blood alcohol limit to .02 reduces drunk driving. (Jan 2012)");



        List<String> education = new ArrayList<>();
        education.add("Our public education system has become a propaganda system. (May 2015)");
        education.add("Private schooling better than Common Core public schooling. (Feb 2015)");
        education.add("When you educate a man, you liberate a man. (May 2014)");
        education.add("College grads today fail a 6th-grade test from the 1800s. (May 2014)");
        education.add("School choice increases competitive nature of education. (Apr 2013)");
        education.add("Education worked for me; don't throw young people away. (Mar 2013)");
        education.add("Evolution and creationism both require faith. (May 2012)");
        education.add("Creationists have God's ethics; evolutionists must find them. (May 2012)");
        education.add("As child, mother required written book reports. (Jan 2012)");
        education.add("Southern slaveowners knew education would empower slaves. (Jan 2012)");
        education.add("Maintaining American pinnacle requires math, not athletics. (Jan 2012)");
        education.add("Carson Scholars Fund: for humanitarian & superior academics. (Jan 2012)");
        education.add("THINK BIG: Talent, Honesty, Insight, Nice, Knowledge.God. (Jan 2012)");
        education.add("Carson Reading Rooms: 4,800 scholarships totaling $2 million. (Jan 2012)");



        List<String> energy = new ArrayList<>();
        energy.add("Smart way in Mideast is to declare energy independence. (Sep 2015)");
        energy.add("Climate debate is distracting and irrelevant. (May 2015)");
        energy.add("Petroleum independence would deprive terrorists of funding. (Jan 2012)");
        energy.add("Intelligently tap our own resources offshore & in Alaska. (Jan 2012)");



        List<String> enviornment = new ArrayList<>();
        enviornment.add("Native Americans casinos are justified, but not beneficial. (Jan 2012)");
        enviornment.add("Protecting environment logical for capitalists & socialists. (Jan 2012)");



        List<String> foreignPolicy = new ArrayList<>();
        foreignPolicy.add("Back Israel and follow what Netanyahu wants on Iran. (May 2015)");
        foreignPolicy.add("Don't just sit around waiting to see what other people do. (Feb 2015)");
        foreignPolicy.add("America on same bad path as ancient Rome, but we can fix it. (May 2014)");
        foreignPolicy.add("US is exceptional, with different values than rest of world. (May 2014)");
        foreignPolicy.add("Rome's decline began with immoral lifestyle; like in America. (Jan 2012)");
        foreignPolicy.add("Freedom is why people come from Cuba to US, not vice versa. (Jan 2012)");
        foreignPolicy.add("US poverty pales compared to billions in India & Africa. (Jan 2012)");



        List<String> trade = new ArrayList<>();
        trade.add("Stop severe trade imbalance via stiff tariffs. (Jan 2012)");
        trade.add("Stop severe trade imbalance. (Jan 2012)");



        List<String> guns = new ArrayList<>();
        guns.add("Law-abiding citizens have right to guns without registration. (Mar 2014)");
        guns.add("Extremely pro-2nd Amendment; never let anyone tamper with it. (Feb 2014)");
        guns.add("Semi-automatic weapons ok in countryside, but not cities. (Mar 2013)");



        List<String> healthCare = new ArrayList<>();
        healthCare.add("Vaccines never caused autism; vaccination is important. (Sep 2015)");
        healthCare.add("Obamacare is about restriction and control. (Feb 2015)");
        healthCare.add("Vaccines are extremely important, despite individual rights. (Feb 2015)");
        healthCare.add("Spokesperson for Mannatech nutrition supplement for 10 years. (Jan 2015)");
        healthCare.add("ObamaCare robs you of your ability to control your own life. (May 2014)");
        healthCare.add("ObamaCare is the worst thing since slavery. (Oct 2013)");
        healthCare.add("Health savings account from birth; teach poor responsibility. (Feb 2013)");
        healthCare.add("Fund HSAs for indigent from collected HSAs of the rest of us. (Feb 2013)");
        healthCare.add("Two-tiered system ok as long as care is adequate. (Jan 2012)");
        healthCare.add("Saudi Arabian solution: stiff penalties for medical fraud. (Jan 2012)");
        healthCare.add("Regulate insurance companies as non-profit services. (Jan 2012)");
        healthCare.add("Government responsibility for catastrophic coverage. (Jan 2012)");
        healthCare.add("Let paralyzed quadriplegics choose to die if they wish it. (Jan 2012)");
        healthCare.add("Suffered research cancer injection and prostate cancer. (Dec 2007)");



        List<String> immigration = new ArrayList<>();
        immigration.add("Turn off the spigots, then allow agricultural guest workers. (Sep 2015)");
        immigration.add("We have the ability to build a border wall, but not the will. (Sep 2015)");
        immigration.add("Moral low road to use cheap labor if no path to citizenship. (Feb 2015)");
        immigration.add("Pathway to citizenship unfair to past & current immigrants. (Feb 2015)");
        immigration.add("Use Canadian model for guest worker program. (Jan 2015)");
        immigration.add("Common-sense solutions: guest workers plus harsher penalties. (Jan 2015)");
        immigration.add("Overwhelming majority want the southern border secured. (Jan 2012)");
        immigration.add("Deportation is moral low road; create guest worker program. (Jan 2012)");



        List<String> jobs = new ArrayList<>();
        jobs.add("Minimum wage should probably be raised; then index it. (Sep 2015)");
        jobs.add("College job: supervised highway cleanup crews. (Jan 2012)");
        jobs.add("Unions bad when they focus on power & not future generations. (Jan 2012)");



        List<String> socialSecurity = new ArrayList<>();
        socialSecurity.add("No issue stance yet recorded by OnTheIssues.org");



        List<String> tax = new ArrayList<>();
        tax.add("Progressive taxation on the rich--that's socialism. (Sep 2015)");
        tax.add("God's a pretty fair guy, so tithing is better than FairTax. (Aug 2015)");
        tax.add("IRS unneeded with proportional flat tax system. (May 2015)");
        tax.add("God says tithe at 10%; no triple tithe for bumper crops. (May 2014)");
        tax.add("Bible endorses flat tax--10% tithing. (Feb 2013)");
        tax.add("Nothing in Constitution supports redistributing wealth. (Jan 2012)");
        tax.add("Not unpatriotic for rich to take advantage of loopholes. (Jan 2012)");



        List<String> technology = new ArrayList<>();
        technology.add("Use computer teaching and virtual classrooms. (Jan 2012)");
        technology.add("Respect privacy; don't use info from post-9-11 monitoring. (Jan 2012)");



        List<String> war = new ArrayList<>();
        war.add("I opposed war in Iraq in 2003; then I opposed withdrawal. (Sep 2015)");
        war.add("Untie the military's hands; let them destroy ISIS. (May 2015)");
        war.add("Tyranny follows if we disarm nukes & madmen get them. (Jan 2012)");
        war.add("No right to assume that our way was right for 1960s Vietnam. (Jan 2012)");
        war.add("Morality of war in Iraq was highly debatable. (Jan 2012)");
        war.add("Better response than post-9-11 invasions: oil independence. (Jan 2012)");



        List<String> welfare = new ArrayList<>();
        welfare.add("Get rid of dependency; that's true compassion. (Feb 2015)");
        welfare.add("Charities better at providing for needy than the government. (Mar 2013)");
        welfare.add("Those who don't want to work? They are on their own. (Jan 2012)");
        welfare.add("Government entitlements compete with private-sector charity. (Jan 2012)");
        welfare.add("Eradicate poverty by providing education and requiring work. (Jan 2012)");





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
