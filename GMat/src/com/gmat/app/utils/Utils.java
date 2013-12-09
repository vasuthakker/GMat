package com.gmat.app.utils;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;

import com.gmat.app.entity.ChapterEntity;
import com.gmat.app.helper.ChapterEntityHelper;

public final class Utils {

	public static void prepareData(Context context) {
		List<ChapterEntity> chapterList = new ArrayList<ChapterEntity>();

		// chapter 1;
		ChapterEntity chapter = new ChapterEntity();
		chapter.setChapterName("Chapter 1: Overview");
		chapter.setChapterDetail("First off, Thank you for your purchase.\nThis app is for all of those people who REALLY want to get an incredible score on the GMAT.  You have found tons of worthless advice on the internet.  There are incredible amounts of false information from people who have little to no credibility (i.e. most of the people leaving comments are completely wrong and that’s why you are confused).  This app is really made to help you ace this test.  It contains all the things that I wish someone told me before I took the test.\nThe GMAT is an extremely fair test.  If you know the material, I promise you that you will be rewarded for it.  Do not for one second think that all your studying is wasted time.  All the things you study help to improve your knowledge base which is exactly what the GMAT tests you on.");
		chapter.setFav(0);
		chapterList.add(chapter);

		// chapter 2
		chapter = new ChapterEntity();
		chapter.setChapterName("Chapter 2: Material Quality");
		chapter.setChapterDetail("Important note to any material listed below: Without a clock on your head/time pressure, nothing will give you a taste of how the real test feels.\nMake sure that you keep the stopwatch or timer within arms- reach no matter what you study.\nManhattan GMAT CATs in general - even though the math is harder, their algorithms somehow do give you a fairly accurate idea of where you stand.\nManhattan GMAT CAT math sections - harder than actual GMAT but great practice\nManhattan GMAT CAT verbal sections - about the same as the actual GMAT - great practice\nGrockit.com - Excellent practice to reinforce ideas that are in the original study guides and some more.\nBest practice tests – Official GMAT Prep.  Use these tests wisely, do not waste them.  Use the first GMAT Prep Test to get an idea of where you stand.  Then get better using other sources.  Then test to see how much better you have gotten using the second GMAT Prep test.  THIS SECOND TEST IS ALMOST EXACTLY HOW THE REAL GMAT WILL FEEL - THE REAL GMAT WILL BE A LITTLE HARDER because there will be no repeats.\nKnewton test - gives you a good idea of where you stand.  And at the time this was written, it is free.\nKaplan verbal - too hard, can be helpful if you have extra time\nKaplan math - too easy, not worth your time\nPrinceton review - too easy, not worth your time\nManhattan question banks - good practice\nOfficial Study Guides - exactly the types of questions you will get - easy once you know the answer but initially they do a great job testing your ability to quickly and creatively come up with an answer.");
		chapter.setFav(0);
		chapterList.add(chapter);

		// chapter 3
		chapter = new ChapterEntity();
		chapter.setChapterName("Chapter 3: Question Quality");
		chapter.setChapterDetail("Directly related to the previous section, a point that I would like to make even more explicitly clear is that you should NOT STRESS YOURSELF over any one single question THAT IS NOT AN ORIGINAL TEST QUESTION/FROM GMAC.  An extremely important note to understand about study materials is that there are a lot of made up/fake/pseudo questions out there that attempt to mimic the original test questions.\nIf you find a question on the internet that stumps you, DON'T WORRY!  It will NEVER show up on the actual GMAT.  The problem with these fake questions is that, unlike the original test questions, the second best answer of these questions is not as clearly incorrect and so often the second best answer is chosen and so you are \"wrong.\"  Whereas in reality, you might not have actually been wrong.  They often use incorrect and also inconsistent logic to justify why the second answer is \"wrong\" and the logic only gets worse as they attempt to make the question \"harder.\"\nOn an original GMAC question, the second best answer is clearly wrong for a solid reason and so it is inarguable.  That is completely not the case with a fake question.");
		chapter.setFav(0);
		chapterList.add(chapter);

		// chapter 4
		chapter = new ChapterEntity();
		chapter.setChapterName("Chapter 4: Understanding Your Score");
		chapter.setChapterDetail("Being good at Math or Verbal is not good enough.  You need to be good at both.  Example: Raw score of 49 (86%tile) in Math and 41 (92%tile) in Verbal = 730 (96%tile) GMAT score.\nSo if your raw scores show that you are getting a 95%tile in math and an 85%tile in verbal, then it would benefit you more to strengthen your verbal.  The logic is that there are very few people who are THAT GOOD at BOTH MATH AND VERBAL.  So take advantage of the fact that you know how you are going to be rewarded best and be well rounded.\nThe size of the jump in your score diminishes as you progress through the test.  So if you get a bunch wrong in the beginning, it will be harder to climb back up.  But also keep in mind that getting a bunch wrong in a row will also hurt your score - most especially at the end of the test - they impose an extra severe penalty for that.  So make sure you give yourself enough time to handle the last questions of each section.");
		chapter.setFav(0);
		chapterList.add(chapter);

		// chapter 5
		chapter = new ChapterEntity();
		chapter.setChapterName("Chapter 5: Problem Solving");
		chapter.setChapterDetail("Writing things out will prevent all the careless mistakes.  The sooner you get yourself into this habit the less effort it will take and the faster you will do it.  On the GMAT, in math, time is of the essence so anything that will shave off some time and enable us to get even closer to a perfect score is important.\nDue to the broad range of math topics covered by the GMAT, see section on Math notes.");
		chapter.setFav(0);
		chapterList.add(chapter);

		// chapter 6
		chapter = new ChapterEntity();
		chapter.setChapterName("Chapter 6: Data Sufficiency");
		chapter.setChapterDetail("Look at statements independently and carefully.  On harder questions, try to get tips/hints from either statement as a test for the other statement.  Be extra careful not to assume any item in either statement when testing the other statement.  Do not assume statements are the same.  There might be a difference.\nDue to the broad range of math topics covered by the GMAT, see section on Math notes.");
		chapter.setFav(0);
		chapterList.add(chapter);

		// chapter 7
		chapter = new ChapterEntity();
		chapter.setChapterName("Chapter 7: Reading Comprehension");
		chapter.setChapterDetail("This is an ongoing theme in the verbal section of the GMAT.  If you are not sure about your answer, most likely you are incorrect.  They do a good job of trying to trick you into choosing the sucker choice.For reading comprehension you need to understand the passage and especially the exact concept/principle from the passage of the question they are asking.  Read each answer very carefully because in some cases the answer sounds right but if you read it very carefully then only will you see the distinction between the right and wrong answer.\nMake sure you get in the habit of using the ABCDE chart discussed in the Study Tips section.  You will be surprised how quickly four incorrect answers get left out and there you have the right answer staring right at you!  Some of the best GMAT test takers use this strategy religiously.");
		chapter.setFav(0);
		chapterList.add(chapter);

		// chapter 8
		chapter = new ChapterEntity();
		chapter.setChapterName("Chapter 8: Critical Reasoning");
		chapter.setChapterDetail("This is an ongoing theme in the verbal section of the GMAT.  If you are not sure about your answer, most likely you are incorrect.  They do a good job of trying to trick you into choosing the sucker choice.\nFor critical reasoning you need to understand the mini - passage and then recognize the assumption or argument which they are testing.  If you do not, then the other answers are designed to be very tempting.  Read the excerpt carefully and then make sure your answer addresses the question completely.\nSometimes wrong answers address the question partially.  In general, unless the question specifically requests it/or the passage is extreme, you don't want anything that is a very extreme answer.\nMake sure you get in the habit of using the ABCDE chart discussed in the Study Tips section.  You will be surprised how quickly four incorrect answers get left out and there you have the right answer staring right at you!  Some of the best GMAT test takers use this strategy religiously.");
		chapter.setFav(0);
		chapterList.add(chapter);

		// chapter 9
		chapter = new ChapterEntity();
		chapter.setChapterName("Chapter 9: Sentence Correction");
		chapter.setChapterDetail("This is an ongoing theme in the verbal section of the GMAT.  If you are not sure about your answer, most likely you are incorrect.  They do a good job of trying to trick you into choosing the sucker choice.\nFor sentence correction you need to understand the grammar rules that are being used in the sentence at hand.  There are four very clearly wrong answers - assuming you know the rules.  The \"sounds right\" approach doesn't work on the harder questions.  The only advantage of the \"sounds right\" approach for native English speakers will be that they might not have to memorize the idioms as instead those might be second nature to them.  Understand the intended meaning behind the original sentence because if an answer choice changes the meaning, it is almost always wrong.\nMake sure you get in the habit of using the ABCDE chart discussed in the Study Tips section.  You will be surprised how quickly four incorrect answers get left out and there you have the right answer staring right at you!  Some of the best GMAT test takers use this strategy religiously.");
		chapter.setFav(0);
		chapterList.add(chapter);

		// chapter 10
		chapter = new ChapterEntity();
		chapter.setChapterName("Chapter 10: Math Notes");
		chapter.setChapterDetail("For any series:\nCount = (biggest - smallest)/interval + 1\nEG: # of 3s from 7 to 70\nCount = (69 - 9)/3 + 1 = 21\nAverage = (biggest + smallest)/2\nEG: Average of even numbers from 34 to 76\nAverage = (76 + 34)/2 = 55\n\nMean = sum/count\nMedian = middle (average of middle two bundles if even number of terms in the series)\nMode = # that appears most frequently\nRange = biggest # - smallest #Symmetric distribution around the median -> mean = median\nIf mean is smaller than median, then distribution is towards smaller numbers\nSimple average (average of average) has no meaning, need weighted average\n\nSum exterior angles = 360\nSum of interior = (n-2)*180\n\n(Ratio of sides)^2 = ratio of areas -> square or triangle\n\nThird side rule -> if you know the lengths of two sides, the lengths of the third side is greater than the difference and smaller than the sum\n\nCommon right triangle ratios\n3:4:5 and multiples there of (6:8:10)\n5:12:13 and multiples there of (10:24:26)\n\nIsosceles right triangle (45:45:90)\nRatio of sides = x:x:x^(1/2)\nIf you know any one side you can find all the other sides"
				+ "\n\n30:60:90 triangle\nRatio of sides = x:x^(1/3):2x\nIf you know any one side you can find all the other sides\n\nIf endpoints are the same, all inscribed angles are 1/2 of the central angle.\n\nSimple Interest - I=Prt\nCompound Interest: Future Value = Present Value(1+(annual int rate/# compounded periods in a year)^(# of periods you care about * number of years)\n\nSTD dev:\n(Each - mean)^2 then add all and divide by total = variance.  Positive sqrt is STD dev\nHas to do with mean, how spread apart are the numbers around the mean.  That is all you need to know for the GMAT.\n\nAmount = Rate x Time\nOn rate problems, opposite direction = add rates; same direction = subtract rates\n\nIf 0<x<1 then x^(0<y<1)>x and x>x^(1<y) - this basically says that if x is a positive fraction, then x to any positive FRACTIONAL power is bigger then x.  \nAnd x is bigger than x to any positive power.\n\nMental note: 90% of the time it is more efficient to use fractions (because things can be crossed out) than to use decimals.\n\nIf answer choices have variables, make up the numbers.  If question has no starting numbers but answers have percentages/fractions,"
				+ " make up the numbers.  \nOf course, be careful to meet all the criteria in the question.\n\nMixture problems/Weighted averages\nx = 40% rye, y = 25% rye, total = 30% rye.  .4x+.25y=.3(x+y)\nMajors 280, students 170, both must be at least 110, max 130  \nMore tips at:  http://gmatclub.com/forum/mixture-problems-i-collected-from-gmat-club-73381.html\n\nAbsolute Value note:\n|x+3|=4x-3, x+3=4x-3, x+3=-(4x-3)\nMake sure you plug x back into the original equation to check to see if it works.  Also, |x+3|=4x-3 means 4x-3>or=0\n\nGroup problems:\nTwo groups\nTotal = G1 + G2 - Both + Neither\nG1 = Only G1+ both\nG2 = Only G2 + both\n\nThree groups\nTotal = G1 + G2 + G3 + Neither - (G1 & G2 overlap) - (G2 & G3 overlap) - (G1 & \nG3 overlap) + (G1, G2, G3 overlap)\n\nTips:\nIf % then Total = 100\nRead carefully, they might imply that Neither = 0.  E.G. \"everyone was in either the band or orchestra or both\"\nUse 2x2 grid chart to efficiently and handle 2x2 group problems.  E.G. \"everyone was in either the band or orchestra or both\" - column labels would be (band, no band, total) row labels would be (orchestra, no orchestra, total)\n\nProbability\n"
				+ "AND = MULTIPLY\nOR = ADD\nProbability = (# of outcomes that must occur)/(total # of possible outcomes)\nIs event independent or dependent?\nIndependent events (e.g. = coin toss) One does not affect the other.Dependent events (e.g. = pulling socks from a drawer) one event can affect the probability of the next event \n\nProbability (happens) + Probability (doesn\'t happen) = 1\nProbability (happens) = 1 - Probability (doesn\'t happen) <- Faster? If so, use it!\n\nCommon Quadratics\n(A+B)^2 = A^2 + 2AB + B^2\n(A-B)^2 = A^2 - 2AB + B^2\n(A+B)(A-B) = A^2-B^2\n\nCombinations - order does not matter\nTotal number of combinations = (n!)/((r!)((n-r)!)) \nn = total number to choose from\nr = total number in a given group\n\nPermutations - order does matter - arrangements\n1.) Create a blank for each position\n2.) Determine the number of possibilities in each blank\n3.) Multiply\nData Sufficiency notes\nOn a medium to hard question, if you quickly dismiss Statement 1 and quickly dismiss Statement 2 and they easily work together then C is not the correct answer -> Trap!\n\n4 pieces of into to think through for Data Sufficiency\n1.) #s you are making up\n2.)"
				+ "Conditions I have to meet\n3.) Expressions we need to evaluate\n4.) Answer to question\nSneak ahead to statement 2 to help you on statement 1 or vice versa.  Harder questions need more analysis as you plug in.\nWhat is X?:\n1.) x^2 = 25 insufficient (X could be + or - 5)\n2.) X=25^(1/2) sufficient (X can only be +5)");
		chapter.setFav(0);
		chapterList.add(chapter);

		// chapter 11
		chapter = new ChapterEntity();
		chapter.setChapterName("Chapter 11: Reading Comprehension Notes");
		chapter.setChapterDetail("Reasons to take notes:\n1.) Forces you to pay attention\n2.) Answers questions\n3.) Locates answers in passage"
				+ "\n\nNotes to take:\n1.) Authors main point/purpose\n2.) Opinions attitudes\n3.) Comparisons/contrasts\n4.) Definitions (mostly science passages)\n5.) Cause & Effect (mostly science passages)\n6.) General conclusions"
				+ "\nPrimary purpose question refers to the ENTIRE passage\nDifficult science passage tips:\n1.) Lots of difficult vocabulary - match vocabulary to correct section\n2.) Most important part of reading comprehension is to see context of question.\nThat is where the answer will be.");
		chapter.setFav(0);
		chapterList.add(chapter);

		// chapter 12
		chapter = new ChapterEntity();
		chapter.setChapterName("Chapter 12: Critical Reasoning Notes");
		chapter.setChapterDetail("Question types:\n1.) Conclusion - must be true\n2.) Strengthen\n3.) Weaken\n4.) Method of reasoning\n5.) Parallel reasoning\n6.) Explain/resolve"
				+ "\n\n#s 1 and 6 are generally a set of facts\n#s 2 through 5 are always arguments\n\n80%-90% of the questions are #s 1 through 3\n\nYet, However, But ...can all introduce conclusions.\n\nSince, Although, Despite, Because.... all introduce premises."
				+ "\nConclusion type questions\nWhat we want is a safe, general wishy washy answer consistent with the stimulus.  Red flags are:\n1.) Inconsistent with the stimulus\n2.) Out of scope (beyond stimulus)\n3.) Extreme/definite answer (not word)"
				+ "\n\nStrengthen/Weaken questions\nPremise to conclusion type - answer should convey that the Authors assumptions are true/false\nCause and effect type - answer should relate to cause and effect relationship\n\nNote - in #2, 3, and 6 question types, if an answer only describes a past trend/future projection/prediction without any explanation, it is the wrong answer.\n\nFlawed is not necessarily wrong, it is just not fully supported.\n\nCommon Reasoning Flaws:"
				+ "\n1.) Circular Reasoning\na.) premise & conclusion are the same\nb.) premises can be linked in a circle\n2.) Non-representative example/questionable analogy\n3.) Assumes continuity from past to future\na.) past = coincidence\nb.) circumstances have changed\n4.) Missing the point\n5.) Statistics problem\na.) confuse a # and a percent"
				+ "\nb.) assume the same #s mentioned twice are related to each other\n6.) Survey/experiment flaws\na.) insufficient sample size\nb.) non-representative sample\nc.) results within margin of error\n7.) Attack the opponent or motives\n8.) Appeal to the wrong authority\n9.) Appeal to popular opinion\n10.) Ambiguous word usage"
				+ "\n11.) Cause and effect flaws:\na.) cause but no effect\nb.) no cause but has effect\nc.) alternate cause\nd.) no cause.  Both effects of a prior cause\n e.) demonstrate reverse causation."
				+ "\n\nFor hard questions, to make the stimulus easier to \"digest\"\nMake the stimulus more tangible\n1.) Make an analogy\n2.) Put yourself in the situation\n3.) Graph/diagram\n4.) Work through some #s");
		chapter.setFav(0);
		chapterList.add(chapter);

		// chapter 13
		chapter = new ChapterEntity();
		chapter.setChapterName("Chapter 13: Sentence Correction Notes");
		chapter.setChapterDetail("Guidelines to looking for the right answer.\n1.) Proper English Grammar\n2.) Effective Expression\na.) clear\nb.) concise\nc.) logical\n3.) Don't change the meaning of the original sentence."
				+ "\n\nTips:\n(noun) is so (adjective) as to be (adjective of a higher degree)\n(noun) is so (adjective) that (independent clause)\nsuch as (used for examples)\nsuch (noun) - refers back to prior mentioned noun.\navoid like these/those; of this/that kind\nhopefully (wrong) versus it is hoped (correct)however - avoid starting a sentence or following a semi-colon with however"
				+ "\nIf (then) - \"you will be sorry if you don't see the movie\" - correct; see context\nWhether (or not) \"he is debating whether to go\" - correct; see context\nSubject verb that - independent clause\nsubject verb noun - object"
				+ "\n\nwho - he/she/they (if you can plug these in then it is correct)\nwhom - him/her/them (if you can plug these in then it is correct)\nwhose - his/her/their\nwhen - refers to a time/time period\nwhere - refers to a location\nwhile - refers to simultaneous actions\nwhich - refers to the immediately prior noun\n\nlike versus as\nlike - nouns\nas - verbs"
				+ "\n\nas - also used on the GMAT to mean - \"in capacity of\"\n\nMany more (not redundant)\nvery unique (redundant)\nmore/less than - difference\nas many/great as - equal or specific multiple\n\nmany/more - comparing quantities"
				+ "\ngreat/greater - comparing #'s /statistics\n\nApples can be quantified: one apple, two apple, three apple, etc.\nMoney cannot be quantified: one money?, two money?, three money?, etc. All wrong \ntherefore money is non-quantifiable.\n\nquantifying words\nmany\nfewer\nnumber\nnon-quantitative words\nmuch\nlittle\namount"
				+ "\n\nmuch fewer/below etc. (all incorrect) - cannot use much with words lacking abundance except \"much less\"  is correct if we are  comparing related actions.  \"I cannot find my keys much less where I put them.\"\nCombined comparisons\nas great as or greater than - incorrect\nat least as great as - correct\n\ntwice/three times/etc -> compares quantities\ndouble/triple/etc -> verbs\nto do - to perform an action\nto have - to own or possess\nto be - to equal or exist\n\nSince (year) - requires present perfect verb\nGrammar Rules\nThese ten categories are the most commonly tested areas in the sentence correction section.  Understand these and this section will be a breeze."
				+ "\n\n1.) Pronouns\na.) Agreement\nb.) Ambiguity\n2.) Verbs\na.) Agreement\nb.) tenses\ni.) past/present/future\nii.) simple/progressive/perfect\nProgressive (-ing) (to be)\n1.) time continuity (explicit or implicit)\n2.) ongoing/habitual\n3.) interruptionPerfect (to have)\n1.) Past (had) - 2+ events at different times in the past\n2.) Present (has/have) - even that started in the past and has a time referent to the present (explicit or implicit)\n3.) Future (will have) - 2+ events at different times in the future+\"\niii.) infinitive (to__)\n1.) modifier \n\"Joe went to buy groceries\"\n2.) To __ is to __\niv.) Being (90% of the time this is used incorrectly on the GMAT!!)\n1.) State of being \"Joe is being silly\"\n2.) Passive progressive \"The fish is being eaten.\"\nv.) Gerunds - progressive word that is used as a noun \n\"smoking causes cancer\"\navoid if a non-gerund synonym is available\nvi) Subjunctive"
				+ "\n1.) wish/possibility/contrary to reality\navoid \"was\" use \"were\" even when singular\n2.) suggestion/demand\n- \"that\"\nActive third person singular noun - plural verb\n\"The bartender demanded that Joe drink quickly\""
				+ "Passive - use \"be\" (only) with the verb"
				+ "\"The bartender demanded that Joe be drunk\"\n3.) Parallel construction"
				+ "\na.) lists and comparisons"
				+ "\nb.) exceptions to parallel contraction"
				+ "\ni.) verb tense are priority over parallel construction"
				+ "\nFred quickly ate the burger while:\n1.) slowly enjoying the wine (correct)\n2.) he slowly enjoyed the wind (incorrect)\n4.) Misplaced modifiers - \"Heavy and sharp, the burglar used the rock to break the window\" - incorrect.  Fixes:\na.) move the noun or modifier to make them adjacent"
				+ "\nb.) Turn phrase into a clause (subject/verb) - \"Because it was...\"\n5.) Idioms (see next chapter for more commonly used idioms) - common phrases that do not necessarily meet all English grammar rules but are considered correct\n(not only....but also)\n6.) Comparison/Quantity words\n(between - comparing 2 things; among - comparing 3+ things)\n7.) Redundancy/Contradiction\n8.) Active versus Passive"
				+ "\na.) to know versus to not know who is doing the action\ni.) Joe put the books away. - correct\nii.) The books were put away. - correct\niii.) The books were put away by Joe.  - passive but we know who is doing it - incorrect.\nb.) commonly used indicators of passive\ni.) simple: was/were; is/are\nii.) progressive: being\niii.) perfect: been\n9.) Adjectives (modify nouns) vs adverbs (ly) (modify verbs)"
				+ "\n10.) Possessive (\'s) - avoid between 2 plural nouns\na.) bank\'s fees - incorrect\nb.) fees of banks - correct\nc.) bank fees - correct\nd.) Bank of America\'s fees - correct"
				+ "\n\nIdiomsMistake x for yConsider - (no helping verbs)In contrast toPlanning toDistinguish between x and yDistinguish x from yJust as x so to yNot only x but also yNot so much x as yx is so y as to be (adj of higher power)x is so y thatProhibit x from yAttribute toDated atCorrelate x with yTo try toRetrieve fromRemembered forForbid x to do yDifference in - implicitDifference between - explicitBecause of (verb phrase)Due to (noun phrase)Different fromDeclare x yTo planX as a means to yEstimated to beExpected toMistake x for yDetermined byTo x as to yThink of x as yIndebted to x for yRequirements ofRequired by");
		chapter.setFav(0);
		chapterList.add(chapter);

		// chapter 14
		chapter = new ChapterEntity();
		chapter.setChapterName("Chapter 14: The 700 barrier");
		chapter.setChapterDetail("This is the difference between thinking you know it and actually knowing it.  It’s fun to think you know it.  But if you are making a lot of mistakes and getting a lot of things wrong then this is probably where you are.  The only way to get through this is practice.  Practice your weakest areas as well as your strongest areas.  Grockit has a nice size database that you can access for free and from anywhere that really drills the material into you.  Paying their fee gives you even more advantages.  I admittedly did that and found it to be quite helpful in reinforcing the different types of questions.  Review your mistakes and learn from them.  That’s how you get better.");
		chapter.setFav(0);
		chapterList.add(chapter);

		// chapter 15
		chapter = new ChapterEntity();
		chapter.setChapterName("Chapter 15: The 750 barrier");
		chapter.setChapterDetail("This is the difference between actually knowing it and being an expert at it.  When you can recognize and solve the same concept even when it is presented to you in the most contorted way known to man.  (That is what you should expect at this level on the actual GMAT).  When you know a concept inside and out.The way the GMAT is structured, to get a score at this level, you have to do sufficiently well in both verbal and math.  So being great at one thing isn't enough.  You need to make your weakest areas strong to get to this level.");
		chapter.setFav(0);
		chapterList.add(chapter);

		// chapter 16
		chapter = new ChapterEntity();
		chapter.setChapterName("Chapter 16: Study Tips");
		chapter.setChapterDetail("Time management - Keep it all under a clock.  You will probably bump into this topic a couple times throughout this guide.  That is because it is by far one of the most important areas.  Everyone can do the hardest problems if given ample time and no pressure.  This is completely unrealistic and though it might be fun and satisfying, it will not raise your score.  The more time pressure you put on yourself, the better off you will be on test day.  But time management means more than that.  It relates to understanding how you get your raw score.  See the section titled Understanding Your Score for more details.  Spend just a touch more time for the first and last five problems on the test because of the logic given in that chapter.  Time management also means that you might have to swallow your pride on the questions that you are stumped by.  The logic is, if you get a questions wrong in the middle of a test then you can make that back up.  But if you start to eat up time that you will need for the last few questions and you get those wrong, there is a much more severe penalty.  You definitely want to make sure you have ample time to handle the last few questions because getting a few wrong in a row will hurt your score a lot - especially at the end.  Pacing yourself throughout the test is important.Repeats are questions that are similar to questions you have seen before.  They are a good way to get more and more familiar with the material and to get faster at working with the material.  Just keep in mind that you aren't going to see these questions on the real test.  So if you want to know how you are doing or where you stand, judge yourself on how you do when you see a "
				+ "NEW question that you haven't seen before.  That is what it’s like on GMAT day.Warm up before.  I found that waking up on Saturday morning and attacking a practice test from a cold start wasn't nearly as helpful as reviewing a little before the test.  Every time you step away from the material you are putting yourself at risk to forgetting small things.  Taking a few minutes to review an old test or some practice problems before a practice test will help you a lot.  Also very important to remember here is:  Don't just review how to solve a problem for example by just looking at the solution....actually solve the problem from scratch.  This also forces you to get out of lazy mode which is a killer on this test."
				+ "Write it out.  You will be amazed at how many fewer careless errors you make by writing it out instead of doing it in your head.  For math, unless it is an extremely simple calculation, it needs to be written out.  The test has too much time pressure to be handling it in your head at this level.  For verbal, instead of thinking in your head 'A is out, C is out, D is out\" it’s much more time efficient to actually draw an ABCDE chart and cross out the letters that are out.  This allows your brain to focus on what is left instead of what is not left.  Writing things out can be an incredibly helpful tool.  For those of you who are not aware or familiar with it, the ABCDE chart is merely a chart drawn on your scratch paper that has an A, B, C, D, & E written down which you can put a line through so that you know what is left.Don't get cocky.  Respect the test and it will respect you.  No matter how smart you are, we all make mistakes.  Getting cocky only allows you to make more mistakes.  Here we are trying to do everything we can to avoid mistakes, we don't need something that is going to make us make more mistakes.Double check what the question is asking.  Sometimes the smallest things get you.  You have done all this work to figure out AB but they want to know what is BA.  Everything we do is to answer their question but it is amazing how few people double check what the question is asking.Think big picture.  What information is provided? How is it relevant? How to organize the information? How to simplify? Pattern?Look at the five answer choices for format, to see if they are consistent or inconsistent, if they are spread apart then approximate, or perhaps use the process of elimination.");
		chapter.setFav(0);
		chapterList.add(chapter);

		// chapter 17
		chapter = new ChapterEntity();
		chapter.setChapterName("Chapter 17: Exam day tips");
		chapter.setChapterDetail("Expect the worst - The actual GMAT is much harder than any of the practice exams that you took.  Guaranteed.  This is coming from someone who scored in the 99% and knows what they are talking about.  As emphasized throughout this guide, what makes it harder is not necessarily the material, but the fact that unlike your practice, there is not repeat material.  The goal of each and every question is to challenge you and is completely unknown to you.  Add time pressure to that.  When you can simulate that experience in your studying then you are best prepared for the test.Get your restDon't stress - if know you it, you will get it right, if you don't, you won't - don't waste time on that question. Eliminate as many as you can and take your best guess.Don't forget time management you learnt in the Study Tips section.Motivation.  A lot of times we need to keep this test in perspective.  Some people might like to run a mile before a practice test, others might let the King of Pop pump them up.  Either way it helps to put things in perspective.  To be great at something takes hard work and dedication.  Whatever motivates you will help you on test day.  Write down \"This is it\" on your paper.  There is nothing wrong with that.  \"No Careless mistakes\"  \"Break this test\" \"Every question counts!\"  Anything that gets you in the right mindset.");
		chapterList.add(chapter);

		// chapter 18
		chapter = new ChapterEntity();
		chapter.setChapterName("Chapter 18: The Greatest Feeling");
		chapter.setChapterDetail("The reward.  As promised, if you know it, you will get your score.  Don't worry about the little things.  When you are all done and you have a phenomenal score, you will see that you deserve it.  Now you can party like you have never partied before!!");
		chapterList.add(chapter);

		// chapter 19
		chapter = new ChapterEntity();
		chapter.setChapterName("Chapter 19: Thank you");
		chapter.setChapterDetail("I hope this helps you get an incredible score.  I hope the material was clear and the content helpful.  If it does, please leave a 5 star rating and some positive feedback for everyone else to see.  Thank you a million times over.");
		chapterList.add(chapter);

		// inserting data
		ChapterEntityHelper.insertChapters(context, chapterList);

	}
}
