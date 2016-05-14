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

public class HillaryClinton extends AppCompatActivity {

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
        setContentView(R.layout.activity_hillary_clinton);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //get the listview
        expListView = (ExpandableListView) findViewById(R.id.lvHil);

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
        abortion.add("It's big government to intervene on woman's right to choose. (Oct 2015)");
        abortion.add("Issues where Jeb Bush disagrees with Hillary. (Dec 2014)");
        abortion.add("Make abortion rare by supporting adoption & foster care. (Apr 2008)");
        abortion.add("Potential for life begins at conception, but don’t intrude. (Apr 2008)");
        abortion.add("Opposed China’s forced abortion & Romania’s forced pregnancy. (Apr 2008)");
        abortion.add("Long-held moderate stance focuses on reducing abortions. (Mar 2008)");
        abortion.add("Consistently uses Dem. Party line, 'safe, legal, and rare'. (Mar 2008)");
        abortion.add("1974: pro-choice fervency not based on any personal abortion. (Jul 2007)");
        abortion.add("1999: keep abortion safe, legal & rare into next century. (Jul 2007)");
        abortion.add("Lift ban on stem cell research to cure devastating diseases. (Jun 2007)");
        abortion.add("1993:Early action on abortion rights ended Right’s dominance. (Jun 2007)");
        abortion.add("Personally would never abort; but deeply values choice. (Jun 2007)");
        abortion.add("Abortion is a sad, tragic choice to many women. (May 2007)");
        abortion.add("Respect Roe v. Wade, but make adoptions easier too. (Nov 2006)");
        abortion.add("Partial birth exceptions for life-threatening abnormalities. (Apr 2006)");
        abortion.add("Government should have no role in abortion decision. (Oct 2005)");
        abortion.add("We can find common ground on abortion issue. (Sep 2005)");
        abortion.add("Alternatives to pro-choice like forced pregnancy in Romania. (Nov 2003)");
        abortion.add("Must safeguard constitutional rights, including choice. (Oct 2000)");
        abortion.add("Late term abortion only if life or health are at risk. (Oct 2000)");
        abortion.add("Remain vigilant on a woman’s right to chose. (Jan 2000)");
        abortion.add("Keep abortion safe, legal and rare. (Jan 1999)");
        abortion.add("Being pro-choice is not being pro-abortion. (Jan 1999)");
        abortion.add("Reach out to teens to reduce teen sex problems. (Jan 1999)");
        abortion.add("Hobby Lobby decision is slippery slope against women. (Jun 2014)");
        abortion.add("1993 health plan included RU-486 & widely available abortion. (Jul 2007)");
        abortion.add("Fought for years to get “Plan B” contraceptive on the market. (Dec 2006)");
        abortion.add("Prevention First Act: federal funds for contraception. (Oct 2006)");
        abortion.add("Advocates birth control but OK with faith-based disagreement. (Nov 2003)");
        abortion.add("Supports parental notice & family planning. (Feb 1997)");
        abortion.add("Cairo Document: right to abortion but not as family planning. (Sep 1996)");
        abortion.add("No abortion for sex selection in China. (Apr 1996)");
        abortion.add("Voted liberal line on partial birth & harm to fetus. (Oct 2005)");
        abortion.add("Voted NO on defining unborn child as eligible for SCHIP. (Mar 2008)");
        abortion.add("Voted NO on prohibiting minors crossing state lines for abortion. (Mar 2008)");
        abortion.add("Voted YES on expanding research to more embryonic stem cell lines. (Apr 2007)");
        abortion.add("Voted NO on notifying parents of minors who get out-of-state abortions. (Jul 2006)");
        abortion.add("Voted YES on $100M to reduce teen pregnancy by education & contraceptives. (Mar 2005)");
        abortion.add("Voted NO on criminal penalty for harming unborn fetus during other crime. (Mar 2004)");
        abortion.add("Voted NO on banning partial birth abortions except for maternal life. (Mar 2003)");
        abortion.add("Endorsed Recommended by EMILY's List of pro-choice women. (Apr 2001)");
        abortion.add("Rated 100% by NARAL, indicating a pro-choice voting record. (Dec 2003)");
        abortion.add("Expand embryonic stem cell research. (Jun 2004)");
        abortion.add("Sponsored bill providing contraceptives for low-income women. (May 2006)");
        abortion.add("Sponsored bill for emergency contraception for rape victims. (Sep 2006)");
        abortion.add("Rated 0% by the NRLC, indicating a pro-choice stance. (Dec 2006)");
        abortion.add("Provide emergency contraception at military facilities. (Apr 2007)");
        abortion.add("Ensure access to and funding for contraception. (Feb 2007)");
        abortion.add("Focus on preventing pregnancy, plus emergency contraception. (Jan 2009)");



        List<String> economy = new ArrayList<>();
        economy.add("We need bankruptcy reform, but we need the right kind. (Aug 2014)");
        economy.add("1998: Personally lobbied Congress against bankruptcy bill. (Apr 2014)");
        economy.add("The economy is not working for middle class families. (Jan 2008)");
        economy.add("Look back to 1990s to see how I’d be fiscally responsible. (Dec 2007)");
        economy.add("Balanced budget replaced with rising costs & falling wages. (Jun 2007)");
        economy.add("2000: Eight years of a great economy is not enough. (Jan 2007)");
        economy.add("Co-sponsored bills totaling $502B in spending thru 2005. (Oct 2006)");
        economy.add("Use tax dollars to upgrade infrastructure, not for stadium. (Oct 2000)");
        economy.add("Pay down debt & cut taxes within balanced budget. (Sep 2000)");
        economy.add("Supports Niagara casino, but prefers job creation strategy. (Sep 2000)");
        economy.add("Protect next generation by paying off national debt. (Aug 2000)");
        economy.add("We have outlived the usefulness of Bretton Woods. (Jun 1999)");
        economy.add("The economy creates consumers but cannot create citizens. (Jun 1999)");
        economy.add("Invest in people instead of “smokestack chasing”. (Feb 1997)");
        economy.add("Voted to limit credit card interest to 30%. (Jan 2008)");
        economy.add("FactCheck: Consistently against making bankruptcy stricter. (Jan 2008)");
        economy.add("2005 bankruptcy bill was by big credit cards & lenders. (Jan 2008)");
        economy.add("Voted YES on $60B stimulus package for jobs, infrastructure, & energy. (Sep 2008)");
        economy.add("Voted NO on paying down federal debt by rating programs' effectiveness. (Mar 2007)");
        economy.add("Voted NO on $40B in reduced federal overall spending. (Dec 2005)");
        economy.add("Require full disclosure about subprime mortgages. (Dec 2007)");
        economy.add("Reform mortgage rules to prevent foreclosure & bankruptcy. (Feb 2008)");



        List<String> civilRights = new ArrayList<>();
        civilRights.add("Women in Public Service Project: 50% of officials by 2050. (Nov 2013)");
        civilRights.add("1998: Hillary predicted female President in near future. (Oct 2007)");
        civilRights.add("1962: met MLK Jr. preaching a sermon in Chicago. (Jul 2007)");
        civilRights.add("1995: Politely criticized China’s human rights. (Jun 2007)");
        civilRights.add("Developmental thread: tragedy of race must be made right. (Jun 2007)");
        civilRights.add("Pushing for privacy bill of rights. (Jun 2006)");
        civilRights.add("Professional woman AND hostess; feminist AND traditionalist. (Nov 2003)");
        civilRights.add("Crack down on sex trafficking of women and girls. (Jan 2000)");
        civilRights.add("Human rights are women’s rights. (Jan 2000)");
        civilRights.add("Women’s rights are human rights. (Dec 1999)");
        civilRights.add("Support National Endowment for the Arts. (Feb 1997)");
        civilRights.add("Sex selection, prostitution & war rape: human rights issues. (Sep 1995)");
        civilRights.add("Women's suffrage was 72-year struggle, but not a shot fired. (Sep 1993)");
        civilRights.add("OpEd: '18 million cracks' meant 'lingering sexism'. (Aug 2009)");
        civilRights.add("Heads movement of women looking to America's true promise. (Aug 2009)");
        civilRights.add("Equal pay is not yet equal. (Jan 2008)");
        civilRights.add("MLK recognized that working within the system was necessary. (Jan 2008)");
        civilRights.add("Compiled “Handbook on Legal Rights for Arkansas Women”. (Nov 2007)");
        civilRights.add("Hillary wanted Bill’s cabinet to “Look Like America”. (Oct 2007)");
        civilRights.add("Founded Vital Voices Initiative with Madeleine Albright. (Sep 2007)");
        civilRights.add("1965: brought black classmates to all-white church. (Jul 2007)");
        civilRights.add("We’ve come a long way on race, but we have a long way to go. (Jun 2007)");
        civilRights.add("1988: Instituted gender diversity Report Card within ABA. (Jun 2007)");
        civilRights.add("Create a pipeline for more women in leadership. (Oct 2005)");
        civilRights.add("1972: Worked with Edelman on school desegregation in South. (Nov 2003)");
        civilRights.add("Apologize for slavery, but concentrate on civil rights now. (Oct 2000)");
        civilRights.add("First chair of ABA Commission on Women and the Profession. (Aug 1999)");
        civilRights.add("Raised issues of gender compensation gap at 1970s Rose Law. (Nov 1997)");
        civilRights.add("Affirmative living: involve entire village against racism. (Sep 1996)");
        civilRights.add("I re-evaluated & changed my mind on gay marriage. (Jun 2014)");
        civilRights.add("We have all evolved on gay marriage since 1990s. (Jun 2014)");
        civilRights.add("DOMA discrimination holds us back from a more perfect union. (Jun 2013)");
        civilRights.add("I support gay marriage personally and as law. (Mar 2013)");
        civilRights.add("Telling kids about gay couples is parental discretion. (Sep 2007)");
        civilRights.add("Positive about civil unions, with full equality of benefits. (Aug 2007)");
        civilRights.add("Let states decide gay marriage; they’re ahead of feds. (Aug 2007)");
        civilRights.add("GLBT progress since 2000, when I marched in gay pride parade. (Aug 2007)");
        civilRights.add("Supports DOMA, which Bill Clinton signed. (Jul 2007)");
        civilRights.add("Don’t ask don’t tell was an important transition step. (Jun 2007)");
        civilRights.add("2004:defended traditional marriage; 2006:voted for same-sex. (May 2007)");
        civilRights.add("Federal Marriage Amendment would be terrible step backwards. (Oct 2006)");
        civilRights.add("Gay soldiers need to shoot straight, not be straight. (Nov 2003)");
        civilRights.add("End hate crimes and other intolerance. (Sep 2000)");
        civilRights.add("Gays deserve domestic partnership benefits. (Feb 2000)");
        civilRights.add("Military service based on conduct, not sexual orientation. (Dec 1999)");
        civilRights.add("Co-sponsored bill to criminalize flag-burning. (Jan 2010)");
        civilRights.add("Op-ed: Sposnored flag-burning bill for centrist credential. (May 2006)");
        civilRights.add("Voted NO on recommending Constitutional ban on flag desecration. (Jun 2006)");
        civilRights.add("Voted NO on constitutional ban of same-sex marriage. (Jun 2006)");
        civilRights.add("Voted YES on adding sexual orientation to definition of hate crimes. (Jun 2002)");
        civilRights.add("Voted YES on loosening restrictions on cell phone wiretapping. (Oct 2001)");
        civilRights.add("Shift from group preferences to economic empowerment of all. (Aug 2000)");
        civilRights.add("Rated 60% by the ACLU, indicating a mixed civil rights voting record. (Dec 2002)");
        civilRights.add("Rated 89% by the HRC, indicating a pro-gay-rights stance. (Dec 2006)");
        civilRights.add("Rated 96% by the NAACP, indicating a pro-affirmative-action stance. (Dec 2006)");
        civilRights.add("Recognize Juneteenth as historical end of slavery. (Jun 2008)");
        civilRights.add("Provide benefits to domestic partners of Federal employees. (Dec 2007)");
        civilRights.add("Re-introduce the Equal Rights Amendment. (Mar 2007)");
        civilRights.add("Reinforce anti-discrimination and equal-pay requirements. (Jan 2008)");



        List<String> corporations = new ArrayList<>();
        corporations.add("OpEd: Disagrees with progressives on corporatism & military. (Dec 2014)");
        corporations.add("Take back $55B in Bush’s industry give-aways. (Apr 2008)");
        corporations.add("FactCheck: Pushed Wal-Mart for women managers & environment. (Jan 2008)");
        corporations.add("World Bank should impose rules on sovereign wealth funds. (Jan 2008)");
        corporations.add("Bush defanged the Consumer Product Safety Commission. (Dec 2007)");
        corporations.add("FactCheck: Yes, Bush shrunk CPSC; but it shrank before Bush. (Dec 2007)");
        corporations.add("Outraged at CEO compensation. (Oct 2007)");
        corporations.add("Stop bankruptcies to get rid of pension responsibilities. (Aug 2007)");
        corporations.add("Enough with corporate welfare; enough with golden parachutes. (Jun 2007)");
        corporations.add("Close lobbyists’ revolving door; end no-bid contracts. (Jun 2007)");
        corporations.add("1976 Rose Law: Fought for industry against electric rate cut. (Jun 2007)");
        corporations.add("Corporate lawyer at Rose Law while Bill was Attorney General. (Jun 2007)");
        corporations.add("Corporate elite treat working-class America as invisible. (Apr 2007)");
        corporations.add("Companies get rewarded with hard-working people left hanging. (Mar 2007)");
        corporations.add("1980s: Loved Wal-Mart's 'Buy America' program. (Jun 2004)");
        corporations.add("1970s: Potential conflict of interest when GM sued Arkansas. (Nov 1997)");
        corporations.add("Businesses play social role in US; gov’t oversight required. (Sep 1996)");
        corporations.add("Family-friendly work policies are good for business. (Sep 1996)");
        corporations.add("Angry at unacceptable acquiescence to greed in the 1980s. (Jun 1994)");
        corporations.add("Serving on boards provides ties but requires defending too. (Aug 1993)");
        corporations.add("Voted YES on repealing tax subsidy for companies which move US jobs offshore. (Mar 2005)");
        corporations.add("Voted YES on restricting rules on personal bankruptcy. (Jul 2001)");
        corporations.add("Rated 35% by the US COC, indicating a mixed business voting record. (Dec 2003)");



        List<String> crime = new ArrayList<>();
        crime.add("Black lives matter: inequality is not inevitable. (Apr 2015)");
        crime.add("Where do Bill and Hillary disagree on social issues? (Jan 2015)");
        crime.add("Longtime advocate of death penalty, with restrictions. (Jan 2008)");
        crime.add("Address the unacceptable increase in incarceration. (Dec 2007)");
        crime.add("Mandatory sentences have been too widely used. (Jun 2007)");
        crime.add("Pushed to expand AMBER alerts & for stricter sex penalties. (Dec 2006)");
        crime.add("Police & firemen refused to shake her hand at Ground Zero. (Feb 2004)");
        crime.add("2001: police & firemen refused her handshake at Ground Zero. (Feb 2004)");
        crime.add("2000: NYPD needs higher pay and better minority relations. (Nov 2003)");
        crime.add("Tap into churches to avoid more Louima & Diallo cases. (Mar 2000)");
        crime.add("Led early crusade for rape evidence and crisis centers. (Aug 1999)");
        crime.add("Supports citizen patrols & 3-Strikes-You’re-Out. (Sep 1996)");
        crime.add("Supports “Three Strikes” and more prison. (Aug 1994)");
        crime.add("Voted YES on reinstating $1.15 billion funding for the COPS Program. (Mar 2007)");
        crime.add("More funding and stricter sentencing for hate crimes. (Apr 2001)");
        crime.add("Require DNA testing for all federal executions. (Mar 2001)");
        crime.add("Increase funding for 'COPS ON THE BEAT' program. (Jan 2007)");
        crime.add("Reduce recidivism by giving offenders a Second Chance. (Mar 2007)");



        List<String> drugs = new ArrayList<>();
        drugs.add("Stop imprisoning marijuana users. (Oct 2015)");
        drugs.add("More drug diversion; more community policing. (Apr 2015)");
        drugs.add("Medical marijuana now; wait-and-see on recreational pot. (Jul 2014)");
        drugs.add("Medical marijuana maybe ok; states decide recreational use. (Jun 2014)");
        drugs.add("Reduce sentencing disparity for crack, but not retroactively. (Dec 2007)");
        drugs.add("1969: held herself aloof from college drug counterculture. (Jul 2007)");
        drugs.add("Divert non-violent drug offenders away from prison. (Jun 2007)");
        drugs.add("Gov. Clinton implicated in his brother Roger’s drug arrest. (Feb 2004)");
        drugs.add("Address drug problem with treatment and special drug courts. (Oct 2000)");
        drugs.add("Ambiguous reports of 1960s college alcohol & drug use. (Aug 1999)");
        drugs.add("Involved parents most influential in reducing teen drug use. (Sep 1996)");
        drugs.add("End harsher sentencing for crack vs. powder cocaine. (Jun 2007)");
        drugs.add("Require chemical resellers to certify against meth use. (Sep 2007)");



        List<String> education = new ArrayList<>();
        education.add("Teach Bible as history & literature; not science or religion. (Apr 2015)");
        education.add("Vouchers aren't constitutional; charter schools are ok. (Apr 2015)");
        education.add("Let's get back to schools where kids are socialized. (Apr 2015)");
        education.add("OpEd: Common Core recycled from Clintons in 1980s and 1990s. (Jun 2013)");
        education.add("Parents are a child’s first teachers. (Jan 2008)");
        education.add("We have not yet reached consensus on education reform. (Sep 2007)");
        education.add("It takes a village; American village has failed our children. (Jun 2007)");
        education.add("Establish right to education from pre-school thru college. (Jun 2007)");
        education.add("Early education affects things from IQ to lifelong earnings. (Dec 2006)");
        education.add("2001: Proposed and passed National Teacher Corps. (Dec 2006)");
        education.add("Teacher testing only for new teachers. (Oct 2000)");
        education.add("Testing only new teachers respects professionalism. (Oct 2000)");
        education.add("Teachers need more peer consulting & more recognition. (Jul 1999)");
        education.add("Social promotion cheats our children. (Jul 1999)");
        education.add("Read to young kids 20-30 minutes daily. (Jul 1999)");
        education.add("Entire school staff should focus on school safety. (Jul 1999)");
        education.add("Metal detectors at school are not much of an intrusion. (Jun 1999)");
        education.add("Arts education is needed in our schools. (Sep 1998)");
        education.add("Give kids after-school activities to prevent gangs. (Apr 1998)");
        education.add("Allow student prayer, but no religious instruction. (Sep 1996)");
        education.add("Character education: teach empathy & self-discipline. (Sep 1996)");
        education.add("Supports Goals 2000: hardly the stuff of revolution. (Sep 1996)");
        education.add("Supports structured inner-city schools, with uniforms. (May 1996)");
        education.add("1960s: Taught reading in poor Boston neighborhoods. (Aug 1993)");
        education.add("Hillary emphasized education reform without political agenda. (Oct 2007)");
        education.add("AR Ed Reform taught that there is a place for testing. (Sep 2007)");
        education.add("1986: HIPPY program empowers parents as kids' first teach. (Sep 2007)");
        education.add("Sent Chelsea to public schools in Arkansas, but not DC. (Jul 2007)");
        education.add("1983: Teacher testing as part of AR education reform. (Jun 2007)");
        education.add("1983: AR reforms fixed unconstitutional school financing. (Jun 2004)");
        education.add("AR Reform plan pushed mandatory teacher testing. (Nov 2003)");
        education.add("Arkansas education: improvement against great odds. (Oct 2000)");
        education.add("Pushed teacher testing in Arkansas. (Dec 1999)");
        education.add("AR ed reform: mandate kindergarten, no social promotion. (Dec 1999)");
        education.add("1983: Challenged low education expectations. (Aug 1999)");
        education.add("1993: Public accepted First Lady as education reformer. (Aug 1999)");
        education.add("Long journey for reform, not isolated initiatives. (Jun 1994)");
        education.add("HIPPY: Home Instruction Program for Preschool Youngsters. (Aug 1993)");
        education.add("Passing illiterate students is educational fraud. (Sep 1983)");
        education.add("End predatory student college loan rates over 20%. (Apr 2008)");
        education.add("Fully fund special education & 21st century classrooms. (Dec 2007)");
        education.add("Get more teachers into hard-to-serve areas. (Nov 2007)");
        education.add("Incentive pay for school wide performance. (Aug 2007)");
        education.add("Universal pre-kindergarten; and make family the best school. (Aug 2007)");
        education.add("Working families cannot participate in school between 9 & 3. (Jul 2007)");
        education.add("Transfer tax cuts from rich & corporations to student aid. (Jun 2006)");
        education.add("Reforms: teacher corps; more federal funding; modernize. (Sep 2000)");
        education.add("Opposes merit pay for individual teachers. (Apr 2000)");
        education.add("Supports merit pay for entire schools. (Apr 2000)");
        education.add("Scholarships for teachers who go to urban schools. (Mar 2000)");
        education.add("Increase resources to meet increased standards. (Mar 2000)");
        education.add("Address teacher shortage with salary increases. (Jul 1999)");
        education.add("More after-school; smaller classes. (Jul 1999)");
        education.add("Total change in No Child Left Behind. (Aug 2007)");
        education.add("Supports public school choice; but not private nor parochial. (Oct 2006)");
        education.add("More teachers, smaller classes, no vouchers. (Oct 2000)");
        education.add("Vouchers would take money from public schools. (Oct 2000)");
        education.add("Vouchers drain money from public schools. (Sep 2000)");
        education.add("Vouchers will not improve our public schools. (Jul 1999)");
        education.add("Let’s build up our schools-not tear them down. (Jul 1999)");
        education.add("Charter schools provide choice within public system. (Jul 1999)");
        education.add("Charters meet needs of failing public school students. (Aug 1998)");
        education.add("Vouchers siphon off much-needed resources. (Aug 1998)");
        education.add("Parents can choose, but support public schools. (Feb 1997)");
        education.add("Supports public school choice and charter schools. (Sep 1996)");
        education.add("Solemn vow never to abandon our public schools. (Jul 1999)");
        education.add("Voted YES on $52M for '21st century community learning centers'. (Oct 2005)");
        education.add("Voted YES on $5B for grants to local educational agencies. (Oct 2005)");
        education.add("Voted YES on shifting $11B from corporate tax loopholes to education. (Mar 2005)");
        education.add("Voted YES on funding smaller classes instead of private tutors. (May 2001)");
        education.add("Voted YES on funding student testing instead of private tutors. (May 2001)");
        education.add("Voted YES on spending $448B of tax cut on education & debt reduction. (Apr 2001)");
        education.add("Offer every parent Charter Schools and public school choice. (Aug 2000)");
        education.add("Rated 82% by the NEA, indicating pro-public education votes. (Dec 2003)");



        List<String> energy = new ArrayList<>();
        energy.add("Obama & I crashed China meeting and got climate change deal. (Oct 2015)");
        energy.add("Take opportunity of climate change to raise our economy. (Oct 2015)");
        energy.add("I now oppose Keystone, but I withheld opinion at first. (Oct 2015)");
        energy.add("$100B per year by 2020 for climate change mitigation. (Jun 2014)");
        energy.add("$100B per year by 2020 for climate change mitigation. (Jun 2014)");
        energy.add("The steady march of climate change is obvious in the Arctic. (Jun 2014)");
        energy.add("Get tough with energy speculators and with OPEC cartel. (May 2008)");
        energy.add("Gas tax holiday, paid for by windfall oil tax. (May 2008)");
        energy.add("GovWatch: Gas tax holiday saves $8B; but that’s 64 cents/day. (May 2008)");
        energy.add("Investigate gas price manipulation; add windfall profits tax. (Apr 2008)");
        energy.add("FactCheck: Yes, FTC is investigating gas price manipulation. (Apr 2008)");
        energy.add("Cap-and-trade as president; compact fluorescents at home. (Apr 2008)");
        energy.add("$650 for help with energy bills to those who can’t afford it. (Jan 2008)");
        energy.add("FactCheck: Oil & gas giveaways stripped from final 2005 Bill. (Jan 2008)");
        energy.add("Investigate & move toward energy efficiency and conservation. (Oct 2007)");
        energy.add("Opposes Yucca Mountain; earthquake fault goes under it. (Sep 2007)");
        energy.add("Led delegation, with McCain, to see effects of polar warming. (Sep 2007)");
        energy.add("Invest in alternative energy; jobs that won’t be outsourced. (Aug 2007)");
        energy.add("End Big Oil tax break; $50 billion for strategic energy fund. (Jul 2007)");
        energy.add("Agnostic about nuclear power until waste & cost issue solved. (Jul 2007)");
        energy.add("FactCheck: There was no Big Oil tax break under Bush-Cheney. (Jul 2007)");
        energy.add("Energy Independence 2020: $50B for Strategic Energy Fund. (Jun 2007)");
        energy.add("Extensive funding into alternative energy. (Jun 2007)");
        energy.add("Will make big oil fund alternative energy research. (Feb 2007)");
        energy.add("$50B strategic energy fund from taxing oil companies. (Oct 2006)");
        energy.add("Remove energy dependence on countries who would harm us. (Jun 2006)");
        energy.add("Need to move toward energy efficiency and conservation. (Jan 2006)");
        energy.add("Supports oil reserve release & fund conservation. (Oct 2000)");
        energy.add("Ratify Kyoto; more mass transit. (Sep 2000)");
        energy.add("Voted YES on removing oil & gas exploration subsidies. (Jun 2007)");
        energy.add("Voted YES on making oil-producing and exporting cartels illegal. (Jun 2007)");
        energy.add("Voted YES on factoring global warming into federal project planning. (May 2007)");
        energy.add("Voted YES on disallowing an oil leasing program in Alaska's ANWR. (Nov 2005)");
        energy.add("Voted YES on $3.1B for emergency oil assistance for hurricane-hit areas. (Oct 2005)");
        energy.add("Voted YES on reducing oil usage by 40% by 2025 (instead of 5%). (Jun 2005)");
        energy.add("Voted YES on banning drilling in the Arctic National Wildlife Refuge. (Mar 2005)");
        energy.add("Voted NO on Bush Administration Energy Policy. (Jul 2003)");
        energy.add("Voted YES on targeting 100,000 hydrogen-powered vehicles by 2010. (Jun 2003)");
        energy.add("Voted YES on removing consideration of drilling ANWR from budget bill. (Mar 2003)");
        energy.add("Voted NO on drilling ANWR on national security grounds. (Apr 2002)");
        energy.add("Voted NO on terminating CAFE standards within 15 months. (Mar 2002)");
        energy.add("Supports tradable emissions permits for greenhouse gases. (Aug 2000)");
        energy.add("Keep efficient air conditioner rule to conserve energy. (Mar 2004)");
        energy.add("Establish greenhouse gas tradeable allowances. (Feb 2005)");
        energy.add("Require public notification when nuclear releases occur. (Mar 2006)");
        energy.add("Rated 100% by the CAF, indicating support for energy independence. (Dec 2006)");
        energy.add("Designate sensitive ANWR area as protected wilderness. (Nov 2007)");
        energy.add("Set goal of 25% renewable energy by 2025. (Jan 2007)");
        energy.add("Let states define stricter-than-federal emission standards. (Jan 2008)");
        energy.add("Gas tax holiday for the summer. (Apr 2008)");



        List<String> enviornment = new ArrayList<>();
        enviornment.add("$5B for green-collar jobs in economic stimulus package. (Jan 2008)");
        enviornment.add("Voted against and consistently opposed to Yucca Mountain. (Jan 2008)");
        enviornment.add("A comprehensive energy plan as our Apollo moon shot. (Jan 2008)");
        enviornment.add("Advocate a cap and trade system. (Dec 2007)");
        enviornment.add("Better track kids’ products for exposures to toxic materials. (Dec 2007)");
        enviornment.add("Support green-collar job training. (Aug 2007)");
        enviornment.add("Put someone in charge of Katrina recovery who actually cares. (Aug 2007)");
        enviornment.add("Overcome almost criminal indifference to Katrina rebuilding. (Jun 2007)");
        enviornment.add("Launched EPA study of air quality at Ground Zero. (Jun 2007)");
        enviornment.add("Scored 100% on Humane Society Scorecard on animal protection. (Jan 2007)");
        enviornment.add("Stands for clean air and funding the EPA. (Sep 2000)");
        enviornment.add("Reduce air pollution to improve children’s health. (Jun 1998)");
        enviornment.add("Voted YES on including oil & gas smokestacks in mercury regulations. (Sep 2005)");
        enviornment.add("Voted NO on confirming Gale Norton as Secretary of Interior. (Jan 2001)");
        enviornment.add("Remove PCBs from Hudson River by dredging 200 miles. (Apr 2001)");
        enviornment.add("Rated 89% by the LCV, indicating pro-environment votes. (Dec 2003)");
        enviornment.add("EPA must do better on mercury clean-up. (Apr 2004)");
        enviornment.add("Sponsored bill for tax credit to remove lead-based paint. (Nov 2005)");
        enviornment.add("Sponsored bill for commission to examine Katrina response. (Sep 2005)");
        enviornment.add("Sponsored health impact bill for environmental health. (Apr 2006)");
        enviornment.add("Grants for beach water pollution under Clean Water Act. (Apr 2008)");
        enviornment.add("Inter-state compact for Great Lakes water resources. (Jul 2008)");
        enviornment.add("Strengthen prohibitions against animal fighting. (Jan 2007)");



        List<String> foreignPolicy = new ArrayList<>();
        foreignPolicy.add("Some world leaders are still misogynistic. (Jun 2014)");
        foreignPolicy.add("Idealistic realism: embody hybrid rather than categorizing. (Jun 2014)");
        foreignPolicy.add("Integrate with Latin America but focus on income inequality. (Jun 2014)");
        foreignPolicy.add("2009: Chose Japan as first destination to emphasize alliance. (Jun 2014)");
        foreignPolicy.add("Smart power: combine civil society & traditional diplomacy. (May 2014)");
        foreignPolicy.add("Does US still have what it takes to lead? Yes!. (May 2014)");
        foreignPolicy.add("Distinguish inherited problems from new ones & opportunities. (May 2014)");
        foreignPolicy.add("'Smart power' combines diplomacy and development. (Sep 2013)");
        foreignPolicy.add("America is the 'indispensable nation'. (Jun 2012)");
        foreignPolicy.add("Ceremonial role abroad as First Lady, but no NSC meetings. (Jun 2012)");
        foreignPolicy.add("New American Moment: new ways of global leadership. (Jun 2012)");
        foreignPolicy.add("2009: Regrets US not part of International Criminal Court. (May 2010)");
        foreignPolicy.add("Commit to helping people abroad before committing troops. (Apr 2008)");
        foreignPolicy.add("Establish leadership & moral authority via multilateralism. (Dec 2007)");
        foreignPolicy.add("Operate from a position of strength, but not confrontation. (Dec 2007)");
        foreignPolicy.add("Supported strong funding for international development. (Oct 2007)");
        foreignPolicy.add("Should not telegraph our adversaries about preconditions. (Aug 2007)");
        foreignPolicy.add("Diplomacy yes; propaganda no; when meeting enemy leaders. (Jul 2007)");
        foreignPolicy.add("Support UN reform because US benefits. (Oct 2005)");
        foreignPolicy.add("Supports USAID projects in developing world. (Nov 2003)");
        foreignPolicy.add("Focus on women's rights in international policy. (Nov 2003)");
        foreignPolicy.add("Engage in world affairs, including human rights. (Oct 2000)");
        foreignPolicy.add("Human rights are central to our objectives abroad. (Oct 2000)");
        foreignPolicy.add("Smartest strategic choice is peace. (Nov 1999)");
        foreignPolicy.add("Foreign aid spending is only 1%; lead by remaining engaged. (Feb 1997)");
        foreignPolicy.add("Supports micro-loans to third-world women. (Sep 1995)");
        foreignPolicy.add("China never fits neatly into category like friend or rival. (Jun 2014)");
        foreignPolicy.add("Get China involved with North Korea diplomacy. (Jun 2014)");
        foreignPolicy.add("China never fits neatly into category like friend or rival. (Jun 2014)");
        foreignPolicy.add("Embed China within broader Asia strategy. (Jun 2014)");
        foreignPolicy.add("Balance American interests between China & Korea. (Jun 2014)");
        foreignPolicy.add("Freedom of navigation & open access in South China Sea. (Jun 2012)");
        foreignPolicy.add("Boycott Olympic ceremony to pressure China on Tibet & Sudan. (Apr 2008)");
        foreignPolicy.add("Establish coherent diplomatic approach toward China. (Dec 2007)");
        foreignPolicy.add("China respects us if we call them on human rights breaches. (Dec 2007)");
        foreignPolicy.add("FactCheck: Chinese did black out Hillary, but DID invite her. (Dec 2007)");
        foreignPolicy.add("Our fiscal responsibility undercuts Chinese power over us. (Aug 2007)");
        foreignPolicy.add("China: criticized authoritarianism with women & children. (Dec 1999)");
        foreignPolicy.add("End the Cuban embargo; that will shift onus to Castros. (Jun 2014)");
        foreignPolicy.add("Focus on BRICs: Brazil, Russia, India, China, & South Africa. (Jun 2012)");
        foreignPolicy.add("Meet with Cuban leaders only after evidence of change. (Feb 2008)");
        foreignPolicy.add("Cuba deserves peaceful transition to freedom & democracy. (Sep 2007)");
        foreignPolicy.add("Keep Cuban embargo; pay UN bills. (Oct 2000)");
        foreignPolicy.add("ISIL is more advanced and well-funded than al Qaeda. (Oct 2014)");
        foreignPolicy.add("Political restraint against Iran's Ahmadinejad was a mistake. (Jun 2014)");
        foreignPolicy.add("2011: we abandoned Egypt's Mubarak too readily. (Jun 2014)");
        foreignPolicy.add("Arab Spring: Egyptian uprising had destabilizing impact. (Jun 2014)");
        foreignPolicy.add("Work toward Arab Spring not being hijacked by extremists. (Jan 2013)");
        foreignPolicy.add("Afghan women are better off, but we must prevent reversal. (Jan 2013)");
        foreignPolicy.add("2007: Traveled to Iraq & Afghanistan before announcement. (Jan 2010)");
        foreignPolicy.add("2001 speech to AIPAC pledges money for Israeli military. (Nov 2007)");
        foreignPolicy.add("Arabic and Muslim countries take women leaders seriously. (Jul 2007)");
        foreignPolicy.add("Allegedly pro-PLO in 1960; but pro-Israel by 1981. (Jul 2007)");
        foreignPolicy.add("Supported Palestine in 1998, before Bill officially did. (May 2007)");
        foreignPolicy.add("Obligation to support Israel with more than foreign aid. (Oct 2005)");
        foreignPolicy.add("Alienated Jewish voters by kissing Mrs. Arafat. (Oct 2001)");
        foreignPolicy.add("2012: Take a harder line with Russia's Putin. (Jun 2014)");
        foreignPolicy.add("1998: organized women's peace conference in Northern Ireland. (Jun 2014)");
        foreignPolicy.add("2009: Northern Ireland shows any adversaries can make good. (Jun 2014)");
        foreignPolicy.add("Push Russia on press freedom; they've killed 20 journalists. (Jun 2014)");
        foreignPolicy.add("Putin's annexing Crimea plays outdated zero-sum game. (Jun 2014)");
        foreignPolicy.add("Russian reset: Pushed Obama to keep Putin at a distance. (Jun 2014)");
        foreignPolicy.add("Eastern Europe in NATO keeps Putin from moving beyond Crimea. (Jun 2014)");
        foreignPolicy.add("2007: Naive to meet with leaders of Iran & North Korea. (Aug 2009)");
        foreignPolicy.add("Committed to maintaining economic embargo against Cuba. (Dec 2008)");
        foreignPolicy.add("Diplomacy with Iran & Cuba, but no presidential meetings. (Feb 2008)");
        foreignPolicy.add("Would use very vigorous and bipartisan diplomacy. (Feb 2008)");
        foreignPolicy.add("Dems believe in fighting terror with cooperation. (Jun 2006)");
        foreignPolicy.add("Voted YES on cooperating with India as a nuclear power. (Oct 2008)");
        foreignPolicy.add("Voted YES on enlarging NATO to include Eastern Europe. (May 2002)");
        foreignPolicy.add("Progressive Internationalism: globalize with US pre-eminence. (Aug 2000)");
        foreignPolicy.add("Increase aid to avert humanitarian crisis in Congo. (Dec 2005)");
        foreignPolicy.add("Implement Darfur Peace Agreement with UN peacekeeping force. (Feb 2008)");
        foreignPolicy.add("Acknowledge the Armenian Genocide of the early 1900s. (Mar 2007)");
        foreignPolicy.add("Urge Venezuela to re-open dissident radio & TV stations. (May 2007)");
        foreignPolicy.add("Call for Burma's junta to release political prisoners. (Jun 2007)");
        foreignPolicy.add("Develop a strategy to protect civilians in Darfur. (Feb 2007)");
        foreignPolicy.add("Let Ukraine & Georgia enter NATO. (Jan 2008)");
        foreignPolicy.add("Condemn violence by Chinese government in Tibet. (Apr 2008)");
        foreignPolicy.add("Sanction Mugabe until Zimbabwe transitions to democracy. (Apr 2008)");
        foreignPolicy.add("Pressure friendly Arab states to end Israeli boycott. (Oct 2007)");



        List<String> trade = new ArrayList<>();
        trade.add("I absorbed new info and changed my mind to oppose TPP. (Oct 2015)");
        trade.add("TPP must produce jobs, raise wages, & protect security. (Apr 2015)");
        trade.add("Chief advocate for Trans-Pacific Partnership (TPP). (Aug 2014)");
        trade.add("TPP agreement creates more growth and better growth. (Aug 2014)");
        trade.add("Global trading system isn't up to standards of fairness. (Jun 2014)");
        trade.add("China benefits from WTO and should play by WTO rules. (Jun 2014)");
        trade.add("Have a trade prosecutor to enforce the trade agreements. (Feb 2008)");
        trade.add("AdWatch: Supported NAFTA in 1998; opposed CAFTA since 2005. (Jan 2008)");
        trade.add("Criticized trade pacts for weak labor standards. (Nov 2007)");
        trade.add("FactCheck: for NAFTA while First Lady; now against CAFTA. (Oct 2007)");
        trade.add("Export from big agribusiness, but also from small farmers. (Aug 2007)");
        trade.add("Smart, pro-American trade: NAFTA has hurt workers. (Aug 2007)");
        trade.add("No fast-track authority for this president. (Aug 2007)");
        trade.add("Better approach: real trade adjustment assistance. (Aug 2007)");
        trade.add("End tax breaks for outsourcing jobs. (Jun 2007)");
        trade.add("Defended outsourcing of US jobs to India. (Oct 2005)");
        trade.add("Globalization should not substitute for humanization. (Jun 1999)");
        trade.add("Supports MFN for China, despite concerns over human rights. (Oct 2000)");
        trade.add("Though Bill supported it, Hillary opposed NAFTA. (Oct 2007)");
        trade.add("Voted against CAFTA despite Bill Clinton’s pushing NAFTA. (Oct 2005)");
        trade.add("Voted YES on free trade agreement with Oman. (Jun 2006)");
        trade.add("Voted NO on implementing CAFTA for Central America free-trade. (Jul 2005)");
        trade.add("Voted YES on establishing free trade between US & Singapore. (Jul 2003)");
        trade.add("Voted YES on establishing free trade between the US and Chile. (Jul 2003)");
        trade.add("Voted NO on extending free trade to Andean nations. (May 2002)");
        trade.add("Voted YES on granting normal trade relations status to Vietnam. (Oct 2001)");
        trade.add("Voted YES on removing common goods from national security export rules. (Sep 2001)");
        trade.add("Build a rule-based global trading system. (Aug 2000)");
        trade.add("Rated 17% by CATO, indicating a pro-fair trade voting record. (Dec 2002)");
        trade.add("Extend trade restrictions on Burma to promote democracy. (Jun 2007)");



        List<String> guns = new ArrayList<>();
        guns.add("Rein in idea that anybody can have a gun anywhere, anytime. (May 2014)");
        guns.add("2000: advocate for national gun registry; 2008: backed off. (May 2014)");
        guns.add("Balance lawful gun ownership & keeping guns from criminals. (Apr 2008)");
        guns.add("Give local police access to federal gun tracking info. (Apr 2008)");
        guns.add("Let states & cities determine local gun laws. (Apr 2008)");
        guns.add("Against illegal guns, crack down on illegal gun dealers. (Jan 2008)");
        guns.add("Backed off a national licensing registration plan on guns. (Jan 2008)");
        guns.add("Get assault weapons & guns off the street. (Jul 2007)");
        guns.add("Background check system could prevent Virginia Tech massacre. (Apr 2007)");
        guns.add("FactCheck: VA Tech shooter not declared a danger to others. (Apr 2007)");
        guns.add("Congress’ failure at Littleton response inspired Senate run. (Nov 2003)");
        guns.add("Keep guns away from people who shouldn’t have them. (Sep 2000)");
        guns.add("Limit access to weapons; look for early warning signs. (Sep 2000)");
        guns.add("License and register all handgun sales. (Jun 2000)");
        guns.add("Tough gun control keeps guns out of wrong hands. (Jul 1999)");
        guns.add("Gun control protects our children. (Jul 1999)");
        guns.add("Don’t water down sensible gun control legislation. (Jul 1999)");
        guns.add("Lock up guns; store ammo separately. (Jun 1999)");
        guns.add("Ban kids’ unsupervised access to guns. (Jun 1999)");
        guns.add("Get weapons off the streets; zero tolerance for weapons. (Sep 1996)");
        guns.add("Voted NO on prohibiting lawsuits against gun manufacturers. (Jul 2005)");
        guns.add("Voted NO on banning lawsuits against gun manufacturers for gun violence. (Mar 2004)");
        guns.add("Prevent unauthorized firearm use with 'smart gun' technology. (Aug 2000)");



        List<String> healthCare = new ArrayList<>();
        healthCare.add("The science is clear: vaccines work. (Feb 2015)");
        healthCare.add("Ebola won't stay confined; put resources into Africa. (Oct 2014)");
        healthCare.add("Don’t legitimize end-of-life decision, but ok to help decide. (Apr 2008)");
        healthCare.add("Decrease generic drug costs for developing countries. (Apr 2008)");
        healthCare.add("Taxpayers pay for drug R&D, not drug companies. (Jan 2008)");
        healthCare.add("Need a health care system that manages chronic diseases. (Jan 2008)");
        healthCare.add("Universal health care is a core Democratic principle. (Jan 2008)");
        healthCare.add("Pledges to support $50B for AIDS relief in US and world. (Dec 2007)");
        healthCare.add("Worked on education & welfare in Arkansas but not healthcare. (Oct 2007)");
        healthCare.add("No parent should be told ‘no’ for healthcare for their kids. (Sep 2007)");
        healthCare.add("Local smoking bans ok, but no national ban. (Sep 2007)");
        healthCare.add("Outcry if AIDS were leading disease of young whites. (Jun 2007)");
        healthCare.add("Electronic medical records save $120 billion in health care. (Jun 2007)");
        healthCare.add("Insurers must fund prevention without preexisting conditions. (Mar 2007)");
        healthCare.add("Require electronic medical record for all federal healthcare. (Mar 2007)");
        healthCare.add("Increase America’s commitment against Global AIDS. (Nov 2006)");
        healthCare.add("FDA should compare drug effectiveness--not just safety. (Oct 2006)");
        healthCare.add("Supply more medical needs of families, & insure all children. (Jun 2006)");
        healthCare.add("Healthcare system plagued with underuse, overuse, and abuse. (Oct 2005)");
        healthCare.add("Fought for pediatric rule: new drugs tested for child safety. (Oct 2005)");
        healthCare.add("Low-tech low-cost water treatment for developing world. (Nov 2003)");
        healthCare.add("Millions uninsured is source of America's healthcare crisis. (Nov 2003)");
        healthCare.add("Recommended 'managed competition'; not single-payer system. (Nov 2003)");
        healthCare.add("Fund teaching hospitals federally because market fails. (Sep 2000)");
        healthCare.add("Regulate tobacco; fine of $3000 for every underage smoker. (Apr 2000)");
        healthCare.add("Be prepared with defenses against infectious disease. (Oct 1999)");
        healthCare.add("Medicare should be strengthened today. (Sep 1999)");
        healthCare.add("GOP overwhelmed by her health reform knowledge. (Jun 1995)");
        healthCare.add("$100B to get started on healthcare reform. (Jun 1994)");
        healthCare.add("Smaller steps to progress on health care. (Jan 2000)");
        healthCare.add("Hillary appointed 8 days after inauguration to health cmte. (Oct 2007)");
        healthCare.add("A plan is necessary; but consensus is more necessary. (Sep 2007)");
        healthCare.add("1993:Ambitious role plagued from start by secrecy complaints. (Jun 2007)");
        healthCare.add("1990s plan failed after big pharma & insurance worked on it. (Apr 2007)");
        healthCare.add("1990s healthcare reforms laid groundwork for today’s reforms. (Mar 2007)");
        healthCare.add("Still scarred from 1990s reform, but now doing it better. (Feb 2007)");
        healthCare.add("1997: Helped found State Children’s Health Insurance Program. (Dec 2006)");
        healthCare.add("More people read my health plan abroad than in the US. (Nov 2005)");
        healthCare.add("1993 health plan initially praised as moderate & workable. (Jun 2004)");
        healthCare.add("1990s reform called “secretive” but had 600 in working group. (Nov 2003)");
        healthCare.add("When last Republican backed out, HillaryCare died. (Nov 2003)");
        healthCare.add("Despite failure, glad she tried system-wide reform. (Nov 2003)");
        healthCare.add("1994 'Harry & Louise' ads exploited consumer fears. (Nov 2003)");
        healthCare.add("1990s plan based on employer mandate. (Feb 2003)");
        healthCare.add("Learned lessons on health care; but hasn’t given up goal. (Aug 2000)");
        healthCare.add("1979: Developed program to deliver rural healthcare. (Aug 1999)");
        healthCare.add("OpEd: 1993 debate was highest level ever reached. (Jun 1997)");
        healthCare.add("1994: can't fix just part of problem; it's all or nothing. (Jan 1997)");
        healthCare.add("2006: If I can't do universal coverage, why run? (Aug 2009)");
        healthCare.add("AdWatch: Got health insurance for six million kids. (Mar 2008)");
        healthCare.add("Include everyone, to avoid cherry-picking and its hidden tax. (Feb 2008)");
        healthCare.add("Healthcare without mandate is like voluntary Social Security. (Feb 2008)");
        healthCare.add("Many uninsured are young & don’t think they need coverage. (Feb 2008)");
        healthCare.add("Make it illegal to discriminate against sick people. (Feb 2008)");
        healthCare.add("Tired of health insurance companies deciding who live or die. (Feb 2008)");
        healthCare.add("Universal health care will not work if it is voluntary. (Feb 2008)");
        healthCare.add("Mandate insurance AND make it affordable for all. (Jan 2008)");
        healthCare.add("Health care tax credit ensures affordability. (Nov 2007)");
        healthCare.add("Insurance companies cannot deny people coverage. (Oct 2007)");
        healthCare.add("Condemns insurers as motivated by greed. (Oct 2007)");
        healthCare.add("American Health Choices Plan: keep yours or pick Congress’. (Sep 2007)");
        healthCare.add("Pay for health plan by $52B tax repeal & $77B efficiencies. (Sep 2007)");
        healthCare.add("Mandated responsibility by individuals, industry & employers. (Sep 2007)");
        healthCare.add("Since 1993, new consensus developed on need for healthcare. (Sep 2007)");
        healthCare.add("Include insurance industry in discussions, but rein them in. (Sep 2007)");
        healthCare.add("Universal health care coverage by the end of my second term. (Feb 2007)");
        healthCare.add("I have the expertise to achieve universal healthcare for all. (Feb 2007)");
        healthCare.add("We need a uniquely American solution to health care. (Oct 2006)");
        healthCare.add("Non-employer system better; but don't turn back ObamaCare. (Mar 2014)");
        healthCare.add("2007: recast 1990s disaster as experience to make it happen. (Jan 2010)");
        healthCare.add("We need a movement to get healthcare done this time. (Aug 2009)");
        healthCare.add("Health care initiatives are her first priority in Senate. (Feb 2001)");
        healthCare.add("Voted YES on overriding veto on expansion of Medicare. (Jul 2008)");
        healthCare.add("Voted NO on means-testing to determine Medicare Part D premium. (Mar 2008)");
        healthCare.add("Voted YES on requiring negotiated Rx prices for Medicare part D. (Apr 2007)");
        healthCare.add("Voted NO on limiting medical liability lawsuits to $250,000. (May 2006)");
        healthCare.add("Voted YES on expanding enrollment period for Medicare Part D. (Feb 2006)");
        healthCare.add("Voted YES on increasing Medicaid rebate for producing generics. (Nov 2005)");
        healthCare.add("Voted YES on negotiating bulk purchases for Medicare prescription drug. (Mar 2005)");
        healthCare.add("Voted NO on $40 billion per year for limited Medicare prescription drug benefit. (Jun 2003)");
        healthCare.add("Voted YES on allowing reimportation of Rx drugs from Canada. (Jul 2002)");
        healthCare.add("Voted YES on allowing patients to sue HMOs & collect punitive damages. (Jun 2001)");
        healthCare.add("Voted NO on funding GOP version of Medicare prescription drug benefit. (Apr 2001)");
        healthCare.add("Establish 'report cards' on HMO quality of care. (Aug 2000)");
        healthCare.add("Invest funds to alleviate the nursing shortage. (Apr 2001)");
        healthCare.add("Let states make bulk Rx purchases, and other innovations. (May 2003)");
        healthCare.add("Rated 100% by APHA, indicating a pro-public health record. (Dec 2003)");
        healthCare.add("End government propaganda on Medicare bill. (Mar 2004)");
        healthCare.add("Sponsored bill for mental health service for older Americans. (May 2005)");
        healthCare.add("Improve services for people with autism & their families. (Apr 2007)");
        healthCare.add("Establish a national childhood cancer database. (Mar 2007)");
        healthCare.add("Preserve access to Medicaid & SCHIP during economic downturn. (Apr 2008)");



        List<String> immigration = new ArrayList<>();
        immigration.add("Immigrants keep America young and dynamic. (Jun 2014)");
        immigration.add("2007: Focus on comprehensive reform, not driver's licenses. (Jan 2010)");
        immigration.add("Allow driver's licenses for illegals until we get reform. (Jan 2010)");
        immigration.add("NY licenses for illegals fills federal gap. (Aug 2009)");
        immigration.add("No official English, but keep common unifying language. (Feb 2008)");
        immigration.add("Introduce a path to earn citizenship in the first 100 days. (Feb 2008)");
        immigration.add("Consider halting certain raids on illegal immigrant families. (Feb 2008)");
        immigration.add("Border fence that cuts off a college campus is absurd. (Feb 2008)");
        immigration.add("Deploy technology & personnel, not a border fence. (Feb 2008)");
        immigration.add("Guest workers only for farms, to address labor shortage. (Feb 2008)");
        immigration.add("Don’t turn local police into immigration enforcers. (Feb 2008)");
        immigration.add("Deporting all illegal immigrants is unrealistic. (Jan 2008)");
        immigration.add("Illegal immigrants with driver’s licenses puts them at risk. (Jan 2008)");
        immigration.add("Exploitation of undocumented workers drives down wages. (Jan 2008)");
        immigration.add("Co-sponsored comprehensive immigration reform in 2004. (Jan 2008)");
        immigration.add("English unifies us; teach ESL but support other languages. (Dec 2007)");
        immigration.add("Crack down on employers who exploit undocumented workers. (Dec 2007)");
        immigration.add("Oppose granting driver’s licenses to illegal immigrants. (Nov 2007)");
        immigration.add("FactCheck: Denied saying licensing illegals “made sense”. (Oct 2007)");
        immigration.add("Immigrant license issue needs federal action on reform. (Oct 2007)");
        immigration.add("More border patrolling on both Mexican AND Canadian borders. (Sep 2007)");
        immigration.add("Immigration reform needs family unification as one goal. (Sep 2007)");
        immigration.add("Anti-immigrant bill would have criminalized Jesus Christ. (Sep 2007)");
        immigration.add("Sanctuary cities ok; local police can’t enforce immigration. (Sep 2007)");
        immigration.add("Making English official imperils crises needing translators. (Jun 2007)");
        immigration.add("Comprehensive reform to get 12 million out of shadows. (Apr 2007)");
        immigration.add("Keep New York-Ontario border passport-free for tourism. (Oct 2006)");
        immigration.add("Adamantly against illegal immigrants. (Sep 2005)");
        immigration.add("Opposes illegal immigration, but doesn’t vote to follow up. (Jun 2007)");
        immigration.add("Voted YES on continuing federal funds for declared 'sanctuary cities'. (Mar 2008)");
        immigration.add("Voted YES on comprehensive immigration reform. (Jun 2007)");
        immigration.add("Voted NO on declaring English as the official language of the US government. (Jun 2007)");
        immigration.add("Voted YES on eliminating the 'Y' nonimmigrant guestworker program. (May 2007)");
        immigration.add("Voted YES on building a fence along the Mexican border. (Sep 2006)");
        immigration.add("Voted YES on establishing a Guest Worker program. (May 2006)");
        immigration.add("Voted YES on allowing illegal aliens to participate in Social Security. (May 2006)");
        immigration.add("Voted YES on giving Guest Workers a path to citizenship. (May 2006)");
        immigration.add("Sponsored bill covering child resident aliens under Medicaid. (May 2005)");
        immigration.add("Sponsored bill funding social services for noncitizens. (May 2006)");
        immigration.add("Rated 8% by USBC, indicating an open-border stance. (Dec 2006)");



        List<String> jobs = new ArrayList<>();
        jobs.add("No salary increase for Congress until minimum wage increased. (Jul 2007)");
        jobs.add("Would accept minimum wage as president. (Jul 2007)");
        jobs.add("Stand up for unions; organize for fair wages. (Jun 2007)");
        jobs.add("Get tough with China and bring jobs back home. (Feb 2007)");
        jobs.add("Minimum wage increases haven’t kept up with Congress’ wages. (Dec 2006)");
        jobs.add("Passed 2 planks of 7-plank platform, “New Jobs for New York”. (Oct 2006)");
        jobs.add("Minimum wage should be tied to congressional salaries. (Jun 2006)");
        jobs.add("Pushed for extension of unemployment insurance. (Feb 2004)");
        jobs.add("The working poor deserve a living wage. (Oct 1999)");
        jobs.add("America can afford to raise the minimum wage. (Sep 1999)");
        jobs.add("Recently “we’re in it together” became “you’re on your own”. (Sep 1996)");
        jobs.add("Voted YES on extending unemployment benefits from 39 weeks to 59 weeks. (Nov 2008)");
        jobs.add("Voted NO on terminating legal challenges to English-only job rules. (Mar 2008)");
        jobs.add("Voted YES on restricting employer interference in union organizing. (Jun 2007)");
        jobs.add("Voted YES on increasing minimum wage to $7.25. (Feb 2007)");
        jobs.add("Voted YES on raising the minimum wage to $7.25 rather than $6.25. (Mar 2005)");
        jobs.add("Voted NO on repealing Clinton's ergonomic rules on repetitive stress. (Mar 2001)");
        jobs.add("Protect overtime pay protections. (Jun 2003)");
        jobs.add("Rated 85% by the AFL-CIO, indicating a pro-union voting record. (Dec 2003)");
        jobs.add("Allow an Air Traffic Controller's Union. (Jan 2006)");
        jobs.add("Sponsored bill linking minimum wage to Congress' pay raises. (May 2006)");
        jobs.add("Extend unemployment compensation during recession. (Jan 2008)");
        jobs.add("Ban discriminatory compensation; allow 2 years to sue. (Jan 2009)");
        jobs.add("Sponsored bill enforcing against gender pay discrimination. (Jan 2009)");



        List<String> socialSecurity = new ArrayList<>();
        socialSecurity.add("Enhance benefits for poorest recipients. (Oct 2015)");
        socialSecurity.add("Privatization off the table; but maybe payroll cap increase. (Aug 2014)");
        socialSecurity.add("No lifting cap on payroll tax; that taxes middle class. (Apr 2008)");
        socialSecurity.add("Bipartisan commission, like in 1983, to address crisis. (Apr 2008)");
        socialSecurity.add("FactCheck: No, teachers & police won’t pay if cap over $102K. (Apr 2008)");
        socialSecurity.add("FactCheck: Yes, removing $97,500 cap affects middle-class. (Nov 2007)");
        socialSecurity.add("Have a bipartisan commission on Social Security and its tax. (Oct 2007)");
        socialSecurity.add("1997: Hillary warned against privatizing Social Security. (Oct 2007)");
        socialSecurity.add("$1000 matching tax credit for first $1000 in 401(k) deposit. (Oct 2007)");
        socialSecurity.add("Solvent until 2055 under Bill Clinton; now has lost 14 years. (Sep 2007)");
        socialSecurity.add("Nothing else on table until fiscal responsibility returns. (Sep 2007)");
        socialSecurity.add("Make sure nobody ever tries to privatize Social Security. (Aug 2007)");
        socialSecurity.add("Soc.Sec. one of greatest inventions in American democracy. (Oct 2006)");
        socialSecurity.add("Social Security protects families, not just retirees. (Feb 1999)");
        socialSecurity.add("All should join the debate now to preserve future solvency. (Feb 1999)");
        socialSecurity.add("Respect unique power of government to meet social needs. (Sep 1996)");
        socialSecurity.add("Elderly poor are hit hardest by delays in COLA increases. (Jun 1994)");
        socialSecurity.add("Voted NO on establishing reserve funds & pre-funding for Social Security. (Mar 2007)");
        socialSecurity.add("Create Retirement Savings Accounts. (Aug 2000)");
        socialSecurity.add("Rated 100% by the ARA, indicating a pro-senior voting record. (Dec 2003)");



        List<String> tax = new ArrayList<>();
        tax.add("Absolutely no tax increase on people earning under $250K. (Apr 2008)");
        tax.add("Perhaps raise capital gains tax, but at most to 20%. (Apr 2008)");
        tax.add("Rescind tax cuts for those making more than $250,000 a year. (Feb 2008)");
        tax.add("AdWatch: cut taxes for the middle class. (Feb 2008)");
        tax.add("Wealthy should go back to paying pre-Bush tax rates. (Jan 2008)");
        tax.add("Want to restore the tax rates we had in the ‘90s. (Dec 2007)");
        tax.add("Freeze estate tax at 2009 level of $7 million per couple. (Oct 2007)");
        tax.add("Why cut off payroll contribution at $95,000? (Jun 2007)");
        tax.add("Cut alternative minimum tax, not billionaire tax cuts. (Mar 2007)");
        tax.add("Expand child tax credit for child’s first year. (Dec 2006)");
        tax.add("End Bush tax cuts;take things away from rich for common good. (Oct 2006)");
        tax.add("To get America back on track, cut short tax cuts. (Sep 2005)");
        tax.add("Social issues matter; wrong time for tax cuts. (Nov 2000)");
        tax.add("NY share of federal taxes is too high. (Feb 2000)");
        tax.add("GOP tax plan would hurt New York’s students. (Aug 1999)");
        tax.add("Just Say No to GOP tax plan. (Sep 1999)");
        tax.add("Voted YES on increasing tax rate for people earning over $1 million. (Mar 2008)");
        tax.add("Voted NO on allowing AMT reduction without budget offset. (Mar 2008)");
        tax.add("Voted NO on raising the Death Tax exemption to $5M from $1M. (Feb 2008)");
        tax.add("Voted NO on repealing the Alternative Minimum Tax. (Mar 2007)");
        tax.add("Voted NO on raising estate tax exemption to $5 million. (Mar 2007)");
        tax.add("Voted NO on supporting permanence of estate tax cuts. (Aug 2006)");
        tax.add("Voted NO on permanently repealing the `death tax`. (Jun 2006)");
        tax.add("Voted YES on $47B for military by repealing capital gains tax cut. (Feb 2006)");
        tax.add("Voted YES on retaining reduced taxes on capital gains & dividends. (Feb 2006)");
        tax.add("Voted YES on extending the tax cuts on capital gains and dividends. (Nov 2005)");
        tax.add("Voted NO on $350 billion in tax breaks over 11 years. (May 2003)");
        tax.add("Voted YES on reducing marriage penalty instead of cutting top tax rates. (May 2001)");
        tax.add("Voted YES on increasing tax deductions for college tuition. (May 2001)");
        tax.add("Rated 21% by NTU, indicating a 'Big Spender' on tax votes. (Dec 2003)");
        tax.add("Rated 80% by the CTJ, indicating support of progressive taxation. (Dec 2006)");



        List<String> technology = new ArrayList<>();
        technology.add("Make sure surveillance doesn't go too far, like Snowden did. (Aug 2014)");
        technology.add("Developing world cell phones open up education & opportunity. (Jun 2014)");
        technology.add("Condemned China's use of Internet to monitor dissidents. (Jun 2012)");
        technology.add("WikiLeaks revealed State Department internal documents. (Jun 2012)");
        technology.add("Post-WikiLeaks 'Apology Tour' to insulted world leaders. (Jun 2012)");
        technology.add("PIPA: When information is stifled, Internet is diminished. (Jan 2012)");
        technology.add("WikiLeaks tears at fabric of government. (Nov 2010)");
        technology.add("Infrastructure investment creates jobs AND improves security. (Aug 2007)");
        technology.add("Fight for interoperable communications for first responders. (Mar 2007)");
        technology.add("Introduced CAMRA to study how sex in media affects teens. (Dec 2006)");
        technology.add("Innovations make better parent-child connections at distance. (Dec 2006)");
        technology.add("Balance Internet freedom of speech against defamation. (Oct 2006)");
        technology.add("$90M grant for Children and Media Research. (Apr 2006)");
        technology.add("Against charging for e-mail. (Oct 2000)");
        technology.add("Details of “Bill 602P” hoax. (Oct 2000)");
        technology.add("Increase spending for libraries. (Mar 2000)");
        technology.add("Equal opportunity will bridge the digital divide. (Jan 2000)");
        technology.add("We can do more for New York’s biotechnology industry. (Nov 1999)");
        technology.add("Train teachers to use technology in classrooms. (Jul 1999)");
        technology.add("Voted NO on restoring $550M in funding for Amtrak for 2007. (Mar 2006)");
        technology.add("Voted YES on disallowing FCC approval of larger media conglomerates. (Sep 2003)");
        technology.add("Chief information officer to digitize federal government. (Aug 2000)");
        technology.add("Fund nanotechnology research & development. (Dec 2003)");
        technology.add("Facilitate nationwide 2-1-1 phone line for human services. (Jan 2007)");
        technology.add("Ensure net neutrality: no corporate-tiered Internet. (Jan 2007)");
        technology.add("Overturn FCC approval of media consolidation. (Mar 2008)");



        List<String> war = new ArrayList<>();
        war.add("Supported decision to target Osama bin Laden. (Sep 2013)");
        war.add("Would have never diverted attention from Afghanistan. (Jan 2008)");
        war.add("After 9/11:Those helping terrorists would feel “wrath” of US. (Jun 2007)");
        war.add("1960s conversion to liberalism based on opposing Vietnam. (Jun 2007)");
        war.add("At Wellesley in ‘68, steered anti-war movement within system. (Jun 2007)");
        war.add("I have seen firsthand terrorists’ terrible damage. (Jun 2007)");
        war.add("Ok to target Al Qaeda in Pakistan; we did that 10 years ago. (Jan 2006)");
        war.add("Strategizing about Pakistan destabilizes a nuclear power. (Aug 2007)");
        war.add("Policy of prevention, not containment, on Iranian nukes. (Jan 2013)");
        war.add("Trust but verify Iran: goal is diplomacy & open inspections. (Jan 2013)");
        war.add("Massive retaliation from US if Iran attacks Israel. (Apr 2008)");
        war.add("Continue diplomatic engagement with Iran. (Dec 2007)");
        war.add("Believed, with others, that Iran was pursuing nuclear weapon. (Dec 2007)");
        war.add("Pledge that Iran will not develop a nuclear bomb. (Oct 2007)");
        war.add("Rushing to war with Iran vs. doing nothing is a false choice. (Oct 2007)");
        war.add("Iran’s Revolutionary Guard promotes terrorism. (Sep 2007)");
        war.add("Prevent Iran from becoming nuclear power by diplomacy first. (Sep 2007)");
        war.add("Rule out nukes against Iran. (Aug 2007)");
        war.add("Iran having a nuclear weapon is absolutely unacceptable. (Jun 2007)");
        war.add("I got it wrong on 2002 Iraq War vote. (Jun 2014)");
        war.add("OpEd: Iraq war follows tradition of active US leadership. (Jun 2012)");
        war.add("OpEd: 2003 Iraq vote unmistakably authorized war. (Nov 2010)");
        war.add("2002: Saddam gave sanctuary to terrorists including Al Qaeda. (Oct 2010)");
        war.add("2007: Avoided war apology to avoid 'flip-flopper' label. (Jan 2010)");
        war.add("2007: Opposed funding Iraq War; no escalation. (Aug 2009)");
        war.add("2002: Saddam gave aid to Al Qaeda terrorists. (Oct 2008)");
        war.add("Up to the Iraqis to decide the future they will have. (Feb 2008)");
        war.add("Some tactical success in Iraq, but no strategic success yet. (Feb 2008)");
        war.add("Leaving 130,000 troops in Iraq is irresponsible abdication. (Jan 2008)");
        war.add("Have nearly all combat troops out in a year. (Jan 2008)");
        war.add("Voted against precedent of US subordinate to UN in Iraq. (Jan 2008)");
        war.add("Iraq war authorization was not authority for preemption. (Jan 2008)");
        war.add("Told by the White House how the war resolution would be used. (Jan 2008)");
        war.add("Withdrawing troops is dangerous, including 100,000 civilians. (Jan 2008)");
        war.add("No military solution in Iraq; this debate motivates solution. (Jan 2008)");
        war.add("Called war on terror “Bush’s war” but has played active role. (Nov 2007)");
        war.add("2002: Accepted connection between Saddam & Al Qaeda. (Nov 2007)");
        war.add("Leave combat troops in Iraq only for conterterrorism. (Sep 2007)");
        war.add("Pentagon calls her unpatriotic for asking about exit plan. (Jul 2007)");
        war.add("Bush misused authorization for war. (Jun 2007)");
        war.add("The Iraq war is Bush’s war. (Jun 2007)");
        war.add("Iraq war wouldn’t have happened had the inspectors been sent. (Jun 2007)");
        war.add("It was a mistake to trust Bush on his judgment to wage war. (Jun 2007)");
        war.add("This war is up to Iraqi people to win or lose, not the US. (Apr 2007)");
        war.add("No permanent bases, but continuing residual force in Iraq. (Apr 2007)");
        war.add("Takes responsibility for Iraq war vote, but not a mistake. (Feb 2007)");
        war.add("OpEd: Voting for war enabled criticizing how it was waged. (Oct 2005)");
        war.add("2002 Iraq speech criticized both Saddam and U.N. (Feb 2004)");
        war.add("2002: Attacking Iraq 'not a good option' but authorized it. (Feb 2004)");
        war.add("No-fly zone in Syria, but no American troops on the ground. (Oct 2015)");
        war.add("Not helping Free Syrian Army left vacuum for ISIS to fill. (Aug 2014)");
        war.add("Don't demand complete moratorium on Israeli settlement. (Jun 2014)");
        war.add("2012: We helped Syrian rebels, but we should have done more. (Jun 2014)");
        war.add("Invested in Israel: negotiate a ceasefire in Gaza. (Jun 2014)");
        war.add("I wanted to arm Syrian rebels, along with regional partners. (Jun 2014)");
        war.add("Obama rejected her 2012 plan to arm the Syrian rebels. (Aug 2013)");
        war.add("Clinton-Gates combo won push for Afghan surge. (Jun 2012)");
        war.add("Supports border security fence in Israel. (Oct 2006)");
        war.add("Cut off US aid if Palestine declares a state unilaterally. (Oct 2000)");
        war.add("Focuses on increasing relationship between US and Israel. (Oct 2000)");
        war.add("Support Israel in finding a safe and secure peace. (May 2000)");
        war.add("Extend peace treaties to Palestinians, Syrians & Lebanese. (Nov 1999)");
        war.add("Putin's annexing Crimea plays outdated zero-sum game. (Jun 2014)");
        war.add("Putin wants to reassert Russia's dominance in its own areas. (Jun 2014)");
        war.add("Contain Russia or Putin will expand beyond Crimea. (Apr 2014)");
        war.add("Iraq war vote was meant to be used as coercive diplomacy. (Jan 2008)");
        war.add("Voted against Levin Amendment: it gave UN veto over US. (Jan 2008)");
        war.add("Voted for Iraq war based on available info; now would not. (Apr 2007)");
        war.add("Critic of Iraq war, but won’t recant 2002 vote in its favor. (Nov 2006)");
        war.add("Regrets Bush’s handling of war, but not her war vote. (Oct 2006)");
        war.add("Voted YES on designating Iran's Revolutionary Guards as terrorists. (Sep 2007)");
        war.add("Voted YES on redeploying US troops out of Iraq by March 2008. (Mar 2007)");
        war.add("Voted NO on redeploying troops out of Iraq by July 2007. (Jun 2006)");
        war.add("Voted YES on investigating contract awards in Iraq & Afghanistan. (Nov 2005)");
        war.add("Voted YES on requiring on-budget funding for Iraq, not emergency funding. (Apr 2005)");
        war.add("Voted YES on $86 billion for military operations in Iraq & Afghanistan. (Oct 2003)");
        war.add("Voted YES on authorizing use of military force against Iraq. (Oct 2002)");
        war.add("Condemns anti-Muslim bigotry in name of anti-terrorism. (Oct 2001)");
        war.add("No troop surge: no military escalation in Iraq. (Jan 2007)");
        war.add("Deploy UN multinational peacekeeping force in Darfur. (Jul 2007)");
        war.add("Require Congress' approval before military action in Iran. (Oct 2007)");



        List<String> welfare = new ArrayList<>();
        welfare.add("In the face of suffering, God calls on us to respond. (Apr 2008)");
        welfare.add("Make sure the economy works for everybody. (Jan 2008)");
        welfare.add("Partner with faith based community in empowerment zones. (Dec 2007)");
        welfare.add("Considered idea of $5000 at birth to pay for future college. (Oct 2007)");
        welfare.add("Time-out for mortgage companies on march toward foreclosure. (Sep 2007)");
        welfare.add("Wellesley thesis: Saul Alinsky & people over bureaucrats. (Jun 2007)");
        welfare.add("Hedge funds incentivize risk, but need regulation. (Apr 2007)");
        welfare.add("Welfare reform was critical step despite flaws. (Nov 2003)");
        welfare.add("Lazio weakened housing standards and limited public housing. (Oct 2000)");
        welfare.add("Lazio fought against FHA on low-interest housing loans. (Oct 2000)");
        welfare.add("Equal access to capital and jobs. (Jan 2000)");
        welfare.add("Working should mean no poverty. (Jan 2000)");
        welfare.add("Community involvement helps, but only in short term. (Dec 1999)");
        welfare.add("Don’t criminalize the homeless. (Dec 1999)");
        welfare.add("1969 thesis: Alinsky’s reforms too short term & local. (Apr 1999)");
        welfare.add("Microcredit is an invaluable tool in alleviating poverty. (Feb 1997)");
        welfare.add("Link payments to good parenting behavior. (Feb 1997)");
        welfare.add("1976: Founded first indigent legal aid in Fayetteville AR. (Aug 1993)");
        welfare.add("Won series of high school awards, but barred from athletics. (Aug 1993)");
        welfare.add("Finish welfare reform by moving able recipients into jobs. (Aug 2000)");
        welfare.add("Establish a National Affordable Housing Trust Fund. (Jul 2003)");
        welfare.add("Tax credits to promote home ownership in distressed areas. (Apr 2003)");
        welfare.add("Fully fund AmeriCorps. (Jun 2003)");







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
