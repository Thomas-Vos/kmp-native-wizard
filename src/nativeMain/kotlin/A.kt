import kotlinx.atomicfu.atomic

private val counter = atomic(0)

internal inline fun bar() {
    counter.getAndSet(0)
}
