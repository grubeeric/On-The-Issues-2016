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

public class CarlyFiorina extends AppCompatActivity {
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
        setContentView(R.layout.activity_carly_fiorina);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //get the listview
        expListView = (ExpandableListView) findViewById(R.id.lvCarly);

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
        abortion.add("Planned Parenthood harvested organs from living babies. (Sep 2015)");
        abortion.add("Ban abortions 20 weeks after fertilization. (May 2015)");
        abortion.add("Liberals believe in protecting flies, but not human life. (Jan 2015)");
        abortion.add("Endorsed as pro-life, fiscal conservative 'Mama Grizzly'. (Nov 2010)");
        abortion.add("Exceptions for rape, incest, and maternal endangerment. (Oct 2010)");
        abortion.add("Overturn the Supreme Court ruling that legalized abortion. (Sep 2010)");
        abortion.add("Embryonic stem cell research ok if not created for purpose. (Sep 2010)");
        abortion.add("Sanctity of life, except in the case of rape and incest. (Jun 2010)");
        abortion.add("Opposes both federal abortion funding & judicial activism. (Aug 2010)");
        abortion.add("Opposes prohibiting human embryonic stem cell research. (Aug 2010)");
        abortion.add("Supports giving legal protection to unborn children. (Sep 2010)");



        List<String> economy = new ArrayList<>();
        economy.add("Stimulus package is a failure; more tax cuts instead. (Oct 2010)");
        economy.add("Key to recovery is less government, taxation, & regulation. (Sep 2010)");
        economy.add("Opposes the stimulus bill. (Sep 2010)");



        List<String> civilRights = new ArrayList<>();
        civilRights.add("U.S. will be better off when women have equal opportunity. (Sep 2015)");
        civilRights.add("Supreme Court overstepped by legalizing same-sex marriage. (May 2015)");
        civilRights.add("I don't just Tweet about equal pay; I lead on pay standards. (Feb 2015)");
        civilRights.add("Women professionals are not treated the same as men. (May 2014)");
        civilRights.add("Marriage is between a man and a woman; but civil unions ok. (Sep 2010)");
        civilRights.add("No same-sex marriage; yes civil unions; repeal DADT. (Sep 2010)");
        civilRights.add("Proud conservative vote for Proposition 8. (Nov 2009)");
        civilRights.add("1976: Worked with monogamous gay couples in college. (Sep 2007)");
        civilRights.add("Hired by AT&T after court ordered them to promote more women. (Sep 2007)");
        civilRights.add("Supports Amendment to prevent same sex marriage. (Aug 2010)");
        civilRights.add("Opposes Employment Non-Discrimination Act (ENDA). (Sep 2010)");



        List<String> corporations = new ArrayList<>();
        corporations.add("I got fired because I challenged the status quo. (Sep 2015)");
        corporations.add("Crony capitalism is alive and well: focus on small business. (Mar 2015)");
        corporations.add("As CEO, laid off 30,000 workers but doubled size of company. (Mar 2015)");
        corporations.add("Focus on supporting small family-owned businesses. (Dec 2009)");
        corporations.add("Favorite business author: philosopher Friedrich Hegel. (Sep 2007)");
        corporations.add("Change takes a critical mass, not 100% support. (Sep 2007)");
        corporations.add("Employees, customers, shareholders, public: all one audience. (Sep 2007)");
        corporations.add("Named 'Most Powerful Businesswoman', but lists are bad idea. (Sep 2007)");
        corporations.add("Strike balance between preservation and reinvention. (Sep 2007)");
        corporations.add("Leaders are made, not born: so develop them. (Sep 2007)");
        corporations.add("If things are working, people don't need a leader's help. (Sep 2007)");



        List<String> crime = new ArrayList<>();
        crime.add("Supports capital punishment for certain crimes. (Aug 2010)");



        List<String> drugs = new ArrayList<>();
        drugs.add("Drug addiction is an epidemic that takes our young people. (Sep 2015)");



        List<String> education = new ArrayList<>();
        education.add("Supports No Child Left Behind & Race to the Top. (May 2015)");
        education.add("Make sure that every parent has a choice. (Mar 2015)");
        education.add("Synthesis of public school system and competitive vouchers. (Mar 2015)");
        education.add("Education crisis:we're behind on teaching skills & character. (Mar 2015)");
        education.add("Dropped out of UCLA Law School at age 22. (Sep 2007)");
        education.add("To truly understand something, explain it to someone else. (Sep 2007)");
        education.add("Supports less federal & more local control of education. (Sep 2010)");



        List<String> energy = new ArrayList<>();
        energy.add("No gas tax increase; lower gas prices good for recovery. (May 2015)");
        energy.add("Pass the Keystone Pipeline even if Obama vetoes it. (Nov 2014)");
        energy.add("Examine the science; US can't act alone on global warming. (Sep 2010)");
        energy.add("Use every source, including nuclear and clean coal. (Dec 2009)");
        energy.add("Supports renewable energy tax credits. (Aug 2010)");
        energy.add("Opposes passage of Cap-and-Trade energy legislation. (Sep 2010)");



        List<String> enviornment = new ArrayList<>();
        enviornment.add("OpEd: Weaken the EPA. (Aug 2010)");
        enviornment.add("Endorsed Targeted as 'Dirty Dozen' for anti-environmentalism. (Aug 2010)");



        List<String> foreignPolicy = new ArrayList<>();
        foreignPolicy.add("Rebuild 6th fleet instead of talking to Putin. (Sep 2015)");
        foreignPolicy.add("No Iran nuke deal unless we can inspect. (Sep 2015)");
        foreignPolicy.add("I know more world leaders than any candidate except Hillary. (Aug 2015)");
        foreignPolicy.add("Our allies need specific help to defeat ISIS. (Jun 2015)");
        foreignPolicy.add("I know the leaders of the Mideast; Obama & Hillary do not. (Feb 2015)");
        foreignPolicy.add("Advised CIA on Russian affairs after 2007. (Feb 2015)");
        foreignPolicy.add("I've accomplished something by traveling around the world. (Jan 2015)");
        foreignPolicy.add("Lack of American leadership causes world trouble. (Jul 2014)");
        foreignPolicy.add("No deal with Russia nor Iran on nuclear cooperation. (Jun 2010)");
        foreignPolicy.add("Attended grade school in U.S., England, and Africa. (Sep 2007)");
        foreignPolicy.add("In Africa, experienced being only white person in the room. (Sep 2007)");
        foreignPolicy.add("1977: Taught English to Italian businessmen in Bologna. (Sep 2007)");
        foreignPolicy.add("Traveled extensively to learn international opportunities. (Sep 2007)");



        List<String> trade = new ArrayList<>();
        trade.add("Change rules about outsourcing; current climate forces it. (Nov 2009)");



        List<String> guns = new ArrayList<>();
        guns.add("Strong supporter of Second Amendment gun rights. (May 2015)");
        guns.add("Opposed 1994 assault weapon ban; opposes no-fly list gun ban. (Oct 2010)");
        guns.add("Let people on no-fly list purchase guns; it's poorly managed. (Oct 2010)");
        guns.add("Assault weapon ban is arbitrary about which weapons qualify. (Sep 2010)");
        guns.add("No-fly list is mismanaged; don't bar gun sales based on it. (Jun 2010)");
        guns.add("Opposes restrictions on the right to bear arms. (Aug 2010)");
        guns.add("Rated AQ by the NRA, indicating a pro-gun rights voting record. (Aug 2010)");



        List<String> healthCare = new ArrayList<>();
        healthCare.add("Repeal ObamaCare; it's vast legislative overreach. (Nov 2014)");
        healthCare.add("Competitive insurance market instead of crony capitalism. (Nov 2014)");
        healthCare.add("Start with medical malpractice reform & more competition. (Dec 2009)");
        healthCare.add("Opposes government-run healthcare. (Aug 2010)");
        healthCare.add("Repeal any federal health care takeover. (Jul 2010)");



        List<String> immigration = new ArrayList<>();
        immigration.add("People tired of just talking about immigration for 25 years. (Sep 2015)");
        immigration.add("14th Amendment allows birthright citizenship; do something. (Sep 2015)");
        immigration.add("Pathway to legalization, but not full citizenship. (Feb 2015)");
        immigration.add("Yes to DREAM Act; don't punish kids living American dream. (Feb 2015)");
        immigration.add("Pass immigration reform in a series of bills. (Nov 2014)");
        immigration.add("No comprehensive reform; but yes to DREAM Act. (Sep 2010)");
        immigration.add("Support the Arizona law because feds are not doing their job. (Jun 2010)");
        immigration.add("Opposes continued funding of sanctuary cities. (Sep 2010)");
        immigration.add("Opposes granting amnesty to illegal immigrants. (Sep 2010)");



        List<String> jobs = new ArrayList<>();
        jobs.add("Layoffs in recession ensure company's overall health. (Mar 2015)");



        List<String> socialSecurity = new ArrayList<>();
        socialSecurity.add("No issue stance yet recorded by OnTheIssues.org");



        List<String> tax = new ArrayList<>();
        tax.add("Current tax system is in desperate need of reform. (May 2015)");
        tax.add("Tax burden is already too high. (Mar 2010)");
        tax.add("I will vote against every tax increase; cut waste instead. (Mar 2010)");
        tax.add("Taxpayer Protection Pledge: no new or increased taxes. (Dec 2009)");
        tax.add("Opposes both marriage penalty & federal tax increases. (Aug 2010)");



        List<String> technology = new ArrayList<>();
        technology.add("Google should cooperate with FBI to fight cyberterrorism. (Aug 2015)");
        technology.add("China and Russia are using technology to attack us. (Aug 2015)");
        technology.add("Overturn net neutrality. (May 2015)");
        technology.add("Taxation on the internet would be disastrous. (Mar 2010)");
        technology.add("Post federal budgets on Internet for public comment. (Dec 2009)");
        technology.add("Simplify complexity so people can understand & deal with it. (Sep 2007)");



        List<String> war = new ArrayList<>();
        war.add("Arm the Kurds and other allies in the Mideast. (Sep 2015)");
        war.add("Ok to deal with Iran, but with anytime/anywhere inspections. (Aug 2015)");
        war.add("Provide materiel to Jordan, & intel to Egypt, to fight ISIL. (Aug 2015)");
        war.add("Break off Iran nuclear negotiations; keep sanctions. (May 2015)");
        war.add("Impose crippling sanctions on Iran. (Jun 2010)");
        war.add("Impose crippling sanctions against Iran. (Mar 2010)");
        war.add("Impose sanctions on Iran: no refined petroleum imports. (Mar 2010)");
        war.add("Two-state solution with Jerusalem as undivided capital. (Mar 2010)");
        war.add("Opposes timetable for troop withdrawal from Afghanistan. (Sep 2010)");



        List<String> welfare = new ArrayList<>();
        welfare.add("No issue stance yet recorded by OnTheIssues.org");



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
