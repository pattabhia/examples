package org.craftedsw.tripservicekata.trip;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.when;

import java.util.List;

import org.craftedsw.tripservicekata.exception.UserNotLoggedInException;
import org.craftedsw.tripservicekata.user.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;


@RunWith(MockitoJUnitRunner.class)
public class TripServiceTest {

	protected static final User UNUSED_USER = null;

	protected static final User GUEST = null;

	private static final User REGISTERED_USER = new User();

	private static final User ANOTHER_USER = new User();

	private static final Trip TO_BRAZIL = new Trip();

	private static final Trip TO_LONDON = new Trip();

	@Mock private TripDAO tripDao;
	
	@InjectMocks @Spy
	private TripService tripService =  new TripService();

	@Test(expected = UserNotLoggedInException.class)
	public void test_should_throw_an_exception_if_user_not_logged_in() {
		tripService.getFriendTrips(UNUSED_USER, GUEST);
	}

	@Test
	public void should_not_return_any_trips_when_users_are_not_friends() {

		User friend = UserBuilder.aUser().friendsWith(ANOTHER_USER).withTrips(TO_BRAZIL).build();
		List<Trip> friendTrips = tripService.getFriendTrips(friend, REGISTERED_USER);
		assertThat(friendTrips.size(), is(0));
	}

	@Test
	public void should_return_friend_trips_when_users_are_friends() {

		User friend = UserBuilder.aUser().friendsWith(ANOTHER_USER, REGISTERED_USER).withTrips(TO_BRAZIL, TO_LONDON)
				.build();
		when(tripDao.tripsBy(friend)).thenReturn(friend.trips());
		List<Trip> friendTrips = tripService.getFriendTrips(friend, REGISTERED_USER);
		assertThat(friendTrips.size(), is(2));
	}

	
}
