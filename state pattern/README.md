In this example the implementation is given in which states are shared across context implementations. It can be modified to ensure that every new instance of the context has its own state instance.

> state pattern with tv as an example..

> states - tv is on, tv is off, TV is idle.

> volume up and down will function only when the TV is in on mode.

> power button will toggle on and off states.

>In the standby mode - press any button to make it active. press power button to turn it off.



If you want to see how this pattern responds to new change please check out this pull request.

https://github.com/Aatmaj-Zephyr/Design-patterns/pull/7



Here idle state of the tv was also added and required changes can be viewed.
