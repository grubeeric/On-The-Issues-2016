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

public class JebBush extends AppCompatActivity {
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
        setContentView(R.layout.activity_jeb_bush);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //get the listview
        expListView = (ExpandableListView) findViewById(R.id.lvJeb);

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
        abortion.add("I defunded Planned Parenthood in Florida; do same federally. (Sep 2015)");
        abortion.add("Husband of Terri Schiavo blames Bush for harassment. (Jan 2015)");
        abortion.add("Terri Schiavo case: ordered feeding tube reinserted. (Feb 2014)");
        abortion.add("OpEd: Jeb avoids extremism on women's issues. (Aug 2012)");
        abortion.add("Funded adoption counseling, but not abortion counseling. (Dec 2009)");
        abortion.add("Prevent use of public funds for stem cell research. (Dec 2009)");
        abortion.add("Created divisive 'Choose Life' license plates. (Feb 2007)");
        abortion.add("Parental consent; clinic regulation; pro-life counseling. (Feb 2007)");
        abortion.add("Restrict abortions to incest, rape, & health. (Jul 1998)");
        abortion.add("No need to teach about abortion if we have moral absolutes. (Nov 1995)");



        List<String> economy = new ArrayList<>();
        economy.add("They called me 'Veto Corleone' because I vetoed so much. (Aug 2015)");
        economy.add("We've achieved 4% growth 27 times; I will make it 28. (Aug 2015)");
        economy.add("6-year recovery has been slower than other comebacks. (Feb 2015)");
        economy.add("$787B economic plan: whole lot of spending & not stimulative. (Feb 2014)");
        economy.add("Stimulus more related to liberal agenda than stimulus. (Feb 2014)");
        economy.add("Bipartisan compromise to reduce the deficit significantly. (Dec 2012)");
        economy.add("Mortgage bankers got us into this mess; they should solve it. (Oct 2011)");
        economy.add("Florida budget grew by 27% during Bush's terms. (Dec 2009)");
        economy.add("Bank bailouts were needed to avoid financial unraveling. (Aug 2009)");
        economy.add("OpEd: 1990 S&L bailout included $4M to Jeb. (Feb 2007)");
        economy.add("1988: Lost $4M in taxpayer bailout of failed Savings & Loan. (Aug 1999)");
        economy.add("Supports constitutional balanced budget amendment. (Nov 1998)");
        economy.add("Bankruptcy reform: limit Chapter 7; protect states' role. (Feb 2001)");
        economy.add("Uphold commitments to states before other spending. (Sep 2001)");



        List<String> civilRights = new ArrayList<>();
        civilRights.add("Accommodate conscience on gay marriage at local level. (Sep 2015)");
        civilRights.add("OpEd: 'One Florida' scrapped affirmative action. (Apr 2015)");
        civilRights.add("Let businesses express religious freedom against gays. (Mar 2015)");
        civilRights.add("Respect civil unions & same-sex lifetime commitments. (Jan 2015)");
        civilRights.add("1994: LGBT protections are tantamount to elevating sodomy. (Jan 2015)");
        civilRights.add("Don't-ask-don't-tell ok if it doesn't affect policy. (Dec 2014)");
        civilRights.add("Traditional marriage best; but recognize gay couples. (Mar 2013)");
        civilRights.add("Replaced affirmative action with 'One Florida' initiative. (Jun 2012)");
        civilRights.add("Insisted on more racial and gender diversity in trial judges. (Mar 2008)");
        civilRights.add("Dismantled Florida's affirmative action program. (Feb 2007)");
        civilRights.add("One Florida: equal minority contracts and admissions. (Feb 2007)");
        civilRights.add("Don't create gays as another category of victims. (Feb 2007)");
        civilRights.add("Removed Confederate battle flag from Florida Capitol. (Feb 2007)");
        civilRights.add("1981: Left Houston based on prejudice against Mexican wife. (Sep 2004)");
        civilRights.add("Provide licensure exams in Spanish, for free. (Jun 2000)");
        civilRights.add("Supports Affirmative Action; against quotas. (Jul 1998)");
        civilRights.add("No hate-crimes status for gays; no gay marriage. (Jul 1998)");
        civilRights.add("Gay rights & feminism are 'modern victim movements'. (Nov 1995)");
        civilRights.add("Support principles embodied in the Equal Rights Amendment. (Feb 2001)");



        List<String> corporations = new ArrayList<>();
        corporations.add("Free-market, pro-development, pro-growth philosophy. (Oct 2014)");
        corporations.add("Stop rewarding portfolio Americans over paycheck Americans. (Oct 2013)");
        corporations.add("Champion enterprise zones and business deregulation. (Mar 2013)");
        corporations.add("Auto bailout was government intervening; bank bailout was ok. (Jun 2012)");
        corporations.add("Touchdown Jacksonville: Bring pro football to Florida. (Feb 2007)");
        corporations.add("$310M in stimulus money to start Scripps biotech facility. (Feb 2007)");
        corporations.add("Cutting taxes on job creators benefits everyone. (Feb 2007)");
        corporations.add("OpEd: Profited on Enron while FL lost $300M. (Jan 2007)");
        corporations.add("Repeal the mandatory helmet law for motorcyclists. (Jun 2000)");
        corporations.add("Fight corporate welfare: snouts out of public trough. (Nov 1995)");



        List<String> crime = new ArrayList<>();
        crime.add("1994: build more prisons; serve longer sentences. (Jan 2015)");
        crime.add("1990s: punishment over therapy; 2010s: that hardens people. (Jan 2015)");
        crime.add("Symbol of crime needs a human face on it. (Dec 2009)");
        crime.add("Passed Habitual Offender Accountability Act. (Dec 2009)");
        crime.add("We are not safe; not in our homes, not anywhere. (Feb 2007)");
        crime.add("1994 TV ad: My opponent won't push electric chair. (Feb 2007)");
        crime.add("Called special legislative session for death penalty law. (Feb 2007)");
        crime.add("Building private prisons would save 15%-20% of state costs. (Feb 2007)");
        crime.add("Make sure criminals serve at least 85% of their jail time. (Oct 2006)");
        crime.add("I'm a hang-'em-by-the-neck conservative. (Sep 2004)");
        crime.add("Adopted Three-Strike Violent Felony Offender Act. (Nov 2001)");
        crime.add("10-20-Life: Increase mandatory minimum sentences. (Nov 2001)");
        crime.add("Fewer death-row appeals; faster executions. (Jan 2000)");
        crime.add("Longer prison terms for gun-toting criminals. (Jan 2000)");
        crime.add("Build more prisons; private contracts OK. (Jul 1998)");
        crime.add("Alternative sentencing & rehabiliation acceptable. (Jul 1998)");
        crime.add("Supports death penalty. (Jul 1998)");
        crime.add("Stricter penalties for drug, sex, & gun offenses. (Jul 1998)");
        crime.add("Heinous crimes no longer news: exposure lowers norms. (Nov 1995)");
        crime.add("Supports flexible federal block grants for crime programs. (Sep 2001)");



        List<String> drugs = new ArrayList<>();
        drugs.add("Opposed medical marijuana on Florida ballot question. (Sep 2015)");
        drugs.add("Smoked pot & drank alcohol in late 1960s high school. (Feb 2015)");
        drugs.add("My high school drug use was 'stupid' and 'wrong'. (Feb 2015)");
        drugs.add("No medical marijuana; it's just a guise toward legalization. (Aug 2014)");
        drugs.add("Illegal drugs moving over US-Mexico border has intensified. (Mar 2013)");
        drugs.add("Deploy military on both sides of the US-Mexican border. (Mar 2013)");
        drugs.add("Funding to reduce teen substance abuse and tobacco use. (Mar 2004)");
        drugs.add("Create a prescription drug tracking system to prevent abuse. (Mar 2004)");
        drugs.add("Opposed treatment instead of jail for nonviolent drug users. (Sep 2002)");
        drugs.add("Mandatory prison sentences for drug offenses. (Nov 2001)");
        drugs.add("Reduce drug use by 50% by prevention & enforcement. (Jul 1999)");
        drugs.add("More federal funding for all aspects of Drug War. (Aug 2000)");



        List<String> education = new ArrayList<>();
        education.add("Feds should not be involved with creation of content. (Aug 2015)");
        education.add("Allow opt-out of Common Core if states define standards. (Aug 2015)");
        education.add("Federal government should create choices, not standards. (Mar 2015)");
        education.add("Common Core is not a federal takeover. (Feb 2015)");
        education.add("I won't run from Common Core, even if GOP does. (Apr 2014)");
        education.add("13,000 politicized unionized monopolies isn't the best model. (Apr 2014)");
        education.add("Common Core is the right thing to do for our country. (Apr 2014)");
        education.add("Advocate for Common Core education standards. (Mar 2014)");
        education.add("No Child Left Behind got states to start reforms. (Oct 2013)");
        education.add("Common core lets 1,000 different curriculum flowers bloom. (Oct 2013)");
        education.add("We test too much; focus on accountability instead. (Oct 2013)");
        education.add("More STEM grads, to maintain global technology leadership. (Mar 2013)");
        education.add("Civics & government for high school graduation. (Mar 2013)");
        education.add("Full immersion for English learners. (Mar 2013)");
        education.add("Education savings accounts: Fund students instead of schools. (Mar 2013)");
        education.add("Restore schools via standards for teachers instead of tenure. (Nov 2012)");
        education.add("Let's give every parent in America a choice about schools. (Aug 2012)");
        education.add("School choice is about unions versus kids. (Aug 2012)");
        education.add("Don't restrict creationism discussion, but don't require it. (Feb 2007)");
        education.add("School prayer OK if prayers are voluntary and student-led. (Mar 1999)");
        education.add("Grade inflation breeds culture of falsely perceived success. (Nov 1995)");
        education.add("I created the 1st, 2nd, and 3rd voucher program in America. (Aug 2015)");
        education.add("1994: cut Department of Education from 2,000 to 50 staff. (Jan 2015)");
        education.add("Ed reform: reading scores improved; parents got more choices. (Feb 2014)");
        education.add("800,000 FL parents selected schools, not district zoning. (Mar 2013)");
        education.add("Teacher bonuses for students passing AP courses. (Mar 2013)");
        education.add("Florida Formula: schools graded A-to-F; extra funding for A. (Nov 2012)");
        education.add("Pushed 1st statewide voucher program & school testing. (Jun 2012)");
        education.add("Guarantee college admission for top 20% of high school grads. (Dec 2009)");
        education.add("Catholic Conference sought more voucher accountability. (Dec 2009)");
        education.add("60% of FCAT-passed schools failed to meet NCLB standards. (Dec 2009)");
        education.add("OpEd: Stacked Board of Regents with Republican donors. (Feb 2007)");
        education.add("Repeal class size limit state constitutional amendment. (Feb 2007)");
        education.add("Co-founded a charter school in poor Miami neighborhood. (Feb 2007)");
        education.add("Make school plan more punitive and more vouchers. (Feb 2007)");
        education.add("1997: Smaller schools are better schools, but also cost more. (Feb 2007)");
        education.add("Voluntary universal Pre-K: fund 9,600 pre-school teachers. (Mar 2004)");
        education.add("A+ Plan: Make 'F' schools disappear; make more 'A' schools. (Jan 2002)");
        education.add("Push for gains among minority and disadvantaged students. (Jan 2002)");
        education.add("Social promotion doesn't do our kids any favors. (Jan 2002)");
        education.add("Restrict grade inflation by imposing minimum standards. (Jun 2000)");
        education.add("Instituted school voucher plan. (Jan 2000)");
        education.add("More funding for schools; merit pay for teachers. (Jul 1998)");
        education.add("Focus on abstinence; end social promotion. (Jul 1998)");
        education.add("Supports charter schools & vouchers. (Jul 1998)");



        List<String> energy = new ArrayList<>();
        energy.add("Why is State Department in permit business for XL pipeline? (Aug 2015)");
        energy.add("Embrace the energy revolution and build the XL pipeline. (Aug 2015)");
        energy.add("On global warming: I'm a skeptic; I'm not a scientist. (Jul 2014)");
        energy.add("Replace crony capitalism with free-market strategy. (Oct 2013)");
        energy.add("A 'patriotic energy policy' will yield far more revenue. (Mar 2013)");
        energy.add("I'm a skeptic about global warming. (Aug 2009)");
        energy.add("We're vulnerable because we don't control our energy sources. (Aug 2009)");
        energy.add("During hurricanes, prosecutes gas stations for price gouging. (Feb 2007)");
        energy.add("2005: 125-mile no-drill zone; then 75 miles ok for drilling. (Feb 2007)");
        energy.add("Eliminate automobile emissions testing. (Jun 2000)");
        energy.add("Voluntary partnerships reduce greenhouse gases economically. (Aug 2000)");
        energy.add("Kyoto Treaty must include reductions by all countries. (Aug 2000)");
        energy.add("More funding to develop domestic energy supplies. (Sep 2001)");
        energy.add("Use federal funds for nuclear cleanup, with state input. (Sep 2001)");
        energy.add("Share offshore oil development revenue with states. (Sep 2001)");
        energy.add("Set goal of 25% renewable energy by 2025. (Jan 2007)");



        List<String> enviornment = new ArrayList<>();
        enviornment.add("Let the market decide on RFS' ethanol in gasoline. (Mar 2015)");
        enviornment.add("1990s: Compensate landowners; 2010s: state-run conservation. (Jan 2015)");
        enviornment.add("Florida Forever: $1B for environmental land purchases. (Dec 2009)");
        enviornment.add("Everglades are 'crown jewel' of Florida environmental legacy. (Dec 2009)");
        enviornment.add("Acceler8: $1.5B plan for Everglades restoration. (Dec 2009)");
        enviornment.add("Declined results of state survey to limit urban sprawl. (Dec 2009)");
        enviornment.add("2004: Universal praise for handling spate of hurricanes. (Feb 2007)");
        enviornment.add("1,920-acre development on edge of Everglades. (Feb 2007)");
        enviornment.add("New marine sanctuary to protect the Florida Keys. (Mar 2004)");
        enviornment.add("Drilling in Gulf of Mexico hurts Florida tourism industry. (Jan 2001)");
        enviornment.add("Restrict Eminent Domain; most severe of all govt powers. (Jun 2000)");
        enviornment.add("Let industries “self-audit”; compensate for “takings”. (Jul 1998)");
        enviornment.add("More state autonomy on brownfields & Superfund cleanups. (Aug 2001)");
        enviornment.add("Support State Revolving Loan Fund for flexible Clean Water. (Aug 2001)");
        enviornment.add("Supports national drought policy, focusing on readiness. (Sep 2001)");
        enviornment.add("Maintain water flow in Mississippi & Missouri Rivers. (Feb 2001)");



        List<String> foreignPolicy = new ArrayList<>();
        foreignPolicy.add("Give Israel sophisticated weapons to send message to Iran. (Sep 2015)");
        foreignPolicy.add("Cancel any nuclear deal Obama makes with Iran. (Jun 2015)");
        foreignPolicy.add("Putin is a bully; expand US troops in countries near Russia. (Jun 2015)");
        foreignPolicy.add("Peace deal with Iran threatens America & menaces Israel. (Mar 2015)");
        foreignPolicy.add("US should shape events and build alliances of free people. (Feb 2015)");
        foreignPolicy.add("Pressured father's V.P. staff to help Cuban prisoners. (Feb 2015)");
        foreignPolicy.add("Built schoolhouse in Mexico on a high school project. (Feb 2015)");
        foreignPolicy.add("Where do the three Bushes disagree on foreign affairs? (Jan 2015)");
        foreignPolicy.add("Strengthen the Cuban embargo instead of lifting it. (Dec 2014)");
        foreignPolicy.add("We are leader among equals in community of nations. (Dec 2014)");
        foreignPolicy.add("Words matter: presidents should mean it when they say it. (Dec 2014)");
        foreignPolicy.add("Nourish our existing alliances: that means NATO & Israel. (Oct 2014)");
        foreignPolicy.add("Passivity hasn't worked on Russia and Ukraine. (May 2014)");
        foreignPolicy.add("Leading from behind is so odd to me. (Apr 2014)");
        foreignPolicy.add("2010: Ineptitude will bring down Chavez regime in Venezuela. (Apr 2014)");
        foreignPolicy.add("Neo-isolationism and American passivity both have dangers. (Mar 2014)");
        foreignPolicy.add("South Korea success: 1952 devastation to 2014 first-world. (Jun 2013)");
        foreignPolicy.add("Supports economic cooperation between US and China. (Jan 2012)");
        foreignPolicy.add("Honorary Cuban to exile community in Miami. (Feb 2007)");
        foreignPolicy.add("Two years in Venezuela; majored in Latin American studies. (Feb 2007)");
        foreignPolicy.add("1988: Joined relief effort for Armenian earthquake. (Oct 2006)");
        foreignPolicy.add("1990: Defended anti-Castro terrorist as patriot in exile. (Sep 2004)");
        foreignPolicy.add("Supports increasing aid to Nigeria and developing countries. (Sep 2004)");
        foreignPolicy.add("Support Israel in its battle against terrorism. (Apr 2004)");
        foreignPolicy.add("Role in the world: military strength and moral clarity. (Jun 1997)");



        List<String> trade = new ArrayList<>();
        trade.add("Strengthen Cuban embargo; talking undermines US credibility. (Dec 2014)");
        trade.add("Four visits to Taiwan to increase trade exchange. (Jun 2004)");
        trade.add("Advocated Miami as HQ for Free Trade Area of the Americas. (Nov 2003)");
        trade.add("Enforce trade law against subsidized Canadian lumber imports. (Sep 2001)");
        trade.add("Bound under state commitment to CAFTA. (Aug 2005)");



        List<String> guns = new ArrayList<>();
        guns.add("99.999% of people should be able to keep their guns. (Sep 2015)");
        guns.add("Stand-your-ground bill: Deadly force OK when threatened. (Dec 2009)");
        guns.add("Violent gun crime rate is down by more than 25%. (Jan 2002)");
        guns.add("Use a Gun and You’re Done. (Nov 2001)");
        guns.add("Concealed carry OK; supports instant background check. (Jul 1998)");



        List<String> healthCare = new ArrayList<>();
        healthCare.add("Fund good care providers for women, not Planned Parenthood. (Sep 2015)");
        healthCare.add("You should vaccinate your children; over and out. (Feb 2015)");
        healthCare.add("Clear & concise response stops unneeded fears about Ebola. (Oct 2014)");
        healthCare.add("Handle Ebola like I handled anthrax in 2001. (Oct 2014)");
        healthCare.add("ObamaCare is flawed to its core, and doesn't work. (May 2014)");
        healthCare.add("ObamaCare is flawed to its core. (Nov 2013)");
        healthCare.add("Let ObamaCare fail due to its own dysfunction. (Oct 2013)");
        healthCare.add("Move Medicaid from 'defined benefit' to defined contribution. (Dec 2009)");
        healthCare.add("Provide risk-adjusted premiums (insurance vouchers). (Dec 2009)");
        healthCare.add("Slashed every request for adult mental health. (Dec 2009)");
        healthCare.add("OpEd: Medicaid reforms won't cover chronic conditions. (Dec 2009)");
        healthCare.add("ObamaCare is focused on access; should be focused on quality. (Aug 2009)");
        healthCare.add("Terri Schiavo: Did all possible to keep her hooked up. (Feb 2007)");
        healthCare.add("Compromised on limiting medical malpractice awards. (Feb 2007)");
        healthCare.add("KidCare and Medikids: expand to 1.6M kids and then even more. (Mar 2004)");
        healthCare.add("Leave research funding to feds, not state. (Jun 2001)");
        healthCare.add("No physician-assisted suicide. (Nov 1998)");
        healthCare.add("No federal pre-emption of employee health plan regulation. (Oct 2001)");
        healthCare.add("Protect state tobacco settlement funds from federal seizure. (Apr 1999)");



        List<String> immigration = new ArrayList<>();
        immigration.add("When students ask questions in Spanish, I answer in Spanish. (Sep 2015)");
        immigration.add("My wife is Mexican and she wants a wall on Mexican border. (Sep 2015)");
        immigration.add("OpEd: Vigorously booed as moderate, by deep conservatives. (Aug 2015)");
        immigration.add("Eliminate sanctuary cities, plus more enforcement. (Aug 2015)");
        immigration.add("Earned legal status, not amnesty. (Aug 2015)");
        immigration.add("There is no plan to deport 11 million people. (Feb 2015)");
        immigration.add("2009: favored deportation; 2012: favored path to citizenship. (Feb 2015)");
        immigration.add("Supports DREAM Act, but not via executive action. (Feb 2015)");
        immigration.add("Immigrants are an engine of economic vitality. (Jan 2015)");
        immigration.add("OpEd: Disagrees with Tea Party on immigration and education. (Dec 2014)");
        immigration.add("OpEd: Rational sympathy rather than economic logic. (Apr 2014)");
        immigration.add("Immigration is 'not a felony' but 'an act of love'. (Apr 2014)");
        immigration.add("Immigrants are committed to family, even if illegally here. (Apr 2014)");
        immigration.add("Illegal immigration is act of love: different kind of crime. (Apr 2014)");
        immigration.add("Advocate for residency for illegal immigrants. (Mar 2014)");
        immigration.add("FactCheck: Yes, immigrants are more fertile. (Jun 2013)");
        immigration.add("My plan is legalization, not self-deportation. (Mar 2013)");
        immigration.add("People come illegally because there's no legal path to come. (Mar 2013)");
        immigration.add("Path to citizenship or path to legalization: both could work. (Mar 2013)");
        immigration.add("Reform must make it easier to come legally than illegally. (Mar 2013)");
        immigration.add("6-part proposal for comprehensive immigration reform. (Mar 2013)");
        immigration.add("There is no realistic pathway to citizenship for most people. (Mar 2013)");
        immigration.add("Limit family reunification: no siblings nor parents. (Mar 2013)");
        immigration.add("Treat illegals with compassion but also rule of law. (Mar 2013)");
        immigration.add("Path to legal resident status: pay fines & no criminals. (Mar 2013)");
        immigration.add("Secure border as component of reform, not as prerequisite. (Mar 2013)");
        immigration.add("To become citizen, pass exam in English and civic history. (Mar 2013)");
        immigration.add("Illegals can't 'wait in line'; there is no line to wait in. (Mar 2013)");
        immigration.add("Objections to more multiracial America are misplaced. (Mar 2013)");
        immigration.add("GOP wooed Hispanics in 2004; but alienated them by 2012. (Jun 2012)");
        immigration.add("Education reform more critical than immigration reform. (Jan 2011)");
        immigration.add("Pray for Comprehensive Immigration Reform, not AZ law. (Apr 2010)");
        immigration.add("1980s: Voter registration for 88,000 naturalized Hispanics. (Feb 2007)");
        immigration.add("Speaks Spanish; husband and father of Hispanics. (Feb 2007)");
        immigration.add("Share costs of legal immigration between states & federal. (Feb 2001)");
        immigration.add("Federal government should deal with criminal repatriation. (Feb 2001)");
        immigration.add("Import farm workers from Mexico. (Sep 2001)");



        List<String> jobs = new ArrayList<>();
        jobs.add("State minimum wages ok, but not at federal level. (Jun 2015)");
        jobs.add("Employ American Workers Act led to lost ideas & lost jobs. (Mar 2013)");
        jobs.add("Job growth during Bush terms, but very low wage jobs. (Dec 2009)");
        jobs.add("Gambling is emblematic of 'something for nothing' culture. (Feb 2007)");
        jobs.add("Operation Paycheck: stimulus for 33,000 construction jobs. (Jan 2002)");
        jobs.add("More R&D & tax incentives for small farmers. (Sep 2001)");
        jobs.add("Repeal the federal unemployment 'temporary surtax'. (Feb 2001)");



        List<String> socialSecurity = new ArrayList<>();
        socialSecurity.add("Push back the retirement age to 68 or 70. (May 2015)");
        socialSecurity.add("Wrong to scare seniors about not protecting Social Security. (Oct 2010)");
        socialSecurity.add("Privatization became administration's fundamental philosophy. (Dec 2009)");
        socialSecurity.add("Social service benefits via private & faith-based companies. (Dec 2009)");
        socialSecurity.add("1994 opponent falsely accused Jeb of cutting Social Security. (Oct 2006)");
        socialSecurity.add("Maintain long-term solvency of Social Security and Medicare. (Aug 2001)");



        List<String> tax = new ArrayList<>();
        tax.add("I am a real conservative. (Sep 2015)");
        tax.add("1994: Require voter approval of any new taxes. (Jan 2015)");
        tax.add("No pledge on taxes; trade-offs on taxes means leadership. (Mar 2014)");
        tax.add("Compromise on taxes ok, as part of a spending cut package. (Mar 2013)");
        tax.add("Remove Intangibles Tax on stocks, bonds & dividends. (Dec 2009)");
        tax.add("1987: supported sales service tax; 1998: opposed it. (Feb 2007)");
        tax.add("Cutting 'intangibles tax' helps 'seniors and savers'. (Feb 2007)");
        tax.add("Supports estate tax repeal, but not at states’ expense. (Jun 2001)");
        tax.add("Don’t broaden county & city taxing authority. (Jun 2001)");
        tax.add("Voter approval of tax increases; cut taxes by $1B. (Jan 2000)");
        tax.add("No national sales tax or VAT. (Feb 2000)");
        tax.add("Let states independently determine estate taxes. (May 2001)");



        List<String> technology = new ArrayList<>();
        technology.add("BlackBerry pictured in official gubernatorial portrait. (Feb 2015)");
        technology.add("US tech revolution needs more foreign-born scientists. (Mar 2013)");
        technology.add("Biometrics for tourist visas; but make it easy as possible. (Mar 2013)");
        technology.add("WikiLeaks is abhorrent but showed seriousness of Iran threat. (Nov 2010)");
        technology.add("Increased transportation budget by 96% over 8 years. (Dec 2009)");
        technology.add("Enraged by citizen initiative mandating high speed rail. (Feb 2007)");
        technology.add("1998 transition team records not subject to open records law. (Feb 2007)");
        technology.add("OpEd: Promised open administration; but delayed all releases. (Feb 2007)");
        technology.add("$24M for X-ray truck inspection & bioterrorism labs. (Jan 2002)");
        technology.add("$100M for Florida Technology Development Initiative. (Jan 2002)");
        technology.add("Practice tech in context of virtue; not isolated pleasure. (Nov 1995)");
        technology.add("Level playing field for Main Street vs. Internet sales tax. (Aug 2001)");
        technology.add("Permanent R&D tax incentive & more R&D funding. (Sep 2001)");



        List<String> war = new ArrayList<>();
        war.add("When we pulled back in Iraq, ISIS filled the void. (Sep 2015)");
        war.add("To honor those who died in Iraq, take out ISIS & stop Iran. (Aug 2015)");
        war.add("Iraq invasion was a mistake; but now we can't abandon them. (Aug 2015)");
        war.add("Add a new U.S. base in Iraq's Anbar province. (Jun 2015)");
        war.add("On Palestine: Israel won't sacrifice when she is threatened. (Mar 2015)");
        war.add("Non-state terrorists are greatest threat we now face. (Feb 2015)");
        war.add("OpEd: Supports 2003 Iraq invasion even with current evidence. (Feb 2015)");
        war.add("1971: Registered for draft but never got drafted. (Feb 2015)");
        war.add("1971: Ambivalent about Vietnam, but would have served. (Feb 2015)");
        war.add("ISIS's rise is because world has no clue where US will be. (Oct 2014)");
        war.add("OpEd: Not distancing himself from brother's Afghan policy. (Mar 2013)");
        war.add("Over time, people will respect our resolve in Iraq. (Mar 2013)");
        war.add("Encourage regime change in Iran; keep military option open. (Nov 2010)");
        war.add("Opposed Vietnam War; considered Conscientious Objection. (Feb 2007)");
        war.add("Disliked Andover because of Vietnam-era campus turmoil. (Feb 2007)");
        war.add("1998: Declined to call for invading Iraq to depose Saddam. (Feb 2007)");
        war.add("1971: Troubled by LBJ's Vietnam, but registered to serve. (Feb 2007)");
        war.add("Easy to criticize Iraq war after the fact. (Apr 2006)");
        war.add("1972: considered conscientious objector status. (Sep 2004)");
        war.add("God grants liberty only to ready to defend it. (Mar 2004)");
        war.add("Extend international order friendly to our security. (Jun 1997)");



        List<String> welfare = new ArrayList<>();
        welfare.add("4% growth strategy to lift people out of poverty. (Sep 2015)");
        welfare.add("Vision for a right-to-rise society. (Feb 2015)");
        welfare.add("1994 Phoenix Project: end welfare culture. (Jan 2015)");
        welfare.add("If you're born poor, the odds are stacked against you. (Mar 2013)");
        welfare.add("Proposed refusing federal money for welfare. (Dec 2009)");
        welfare.add("Created Governor's Faith-Based Advisory Board. (Dec 2009)");
        welfare.add("1994: Get tough on recipients of public assistance. (Feb 2007)");
        welfare.add("More government money to religious groups. (Feb 2007)");
        welfare.add("Welcome community and faith based organizations as partners. (Mar 2004)");
        welfare.add("Replace AFDC with limited temporary assistance. (Jan 2000)");
        welfare.add("Limit welfare benefits; supports welfare-to-work. (Jul 1998)");
        welfare.add("Help welfare recipients into workforce. (Jul 1998)");
        welfare.add("Taking welfare should be more shameful than working. (Nov 1995)");
        welfare.add("Maintain federal Social Services Block Grant funding. (Sep 2001)");
        welfare.add("Maintain flexibility & funding levels for TANF block grants. (Sep 2001)");
        welfare.add("More federal funding for Low-income energy assistance. (Sep 2001)");
        welfare.add("Supports TANF grants to states. (Aug 2001)");




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
