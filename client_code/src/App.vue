<template>
  <router-view />
</template>
<script>
const debounce = (fn, delay) => {
  let timer = null
  return function () {
    let context = this
    let args = arguments
    clearTimeout(timer)
    timer = setTimeout(function () {
      fn.apply(context, args)
    }, delay)
  }
}

const _ResizeObserver = window.ResizeObserver
window.ResizeObserver = class ResizeObserver extends _ResizeObserver {
  constructor(callback) {
    callback = debounce(callback, 16)
    super(callback)
  }
}
</script>
<style lang="scss">
body {
	margin: 0;
}
* {
	box-sizing: border-box;
}
.app-contain {
	width: 100%;
	// padding: 0 8%;
	// box-sizing: border-box;
}
.section_title {
	border: 0px solid #ddd;
	border-radius: 0px;
	padding: 0 0 0 10px;
	margin: 20px 0;
	color: #fff;
	background: url(http://localhost:8080/gymManage/file/73858ea51f9d45ca9e8050c010c86bed.png) no-repeat right center / auto 100%,url(http://localhost:8080/gymManage/file/a28120fb58984b43a15621576e0e5868.png) no-repeat left center / auto 100%,linear-gradient(158deg, rgba(0,88,171,1) 0%, rgba(0,88,171,1) 20%, rgba(75,149,218,1) 49%, rgba(0,88,171,1) 80%, rgba(0,88,171,1) 100%),#0058ab;
	font-weight: 500;
	letter-spacing: 2px;
	width: 100%;
	font-size: 16px;
	line-height: 40px;
	text-align: center;
}

#app {
	font-family: Avenir, Helvetica, Arial, sans-serif;
	-webkit-font-smoothing: antialiased;
	-moz-osx-font-smoothing: grayscale;
	// text-align: center;
	color: #2c3e50;
}

nav {
	padding: 30px;

	a {
		font-weight: bold;
		color: #2c3e50;

		&.router-link-exact-active {
			color: #42b983;
		}
	}
}
</style>
