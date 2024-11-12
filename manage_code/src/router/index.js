	import {
		createRouter,
		createWebHashHistory
	} from 'vue-router'
	import jianshenjiaolian from '@/views/jianshenjiaolian/list'
	import forum from '@/views/forum/list'
	import news from '@/views/news/list'
	import jianshenkecheng from '@/views/jianshenkecheng/list'
	import jianshenzhishi from '@/views/jianshenzhishi/list'
	import yonghu from '@/views/yonghu/list'
	import jianshenqicai from '@/views/jianshenqicai/list'
	import storeup from '@/views/storeup/list'
	import kechenggoumai from '@/views/kechenggoumai/list'
	import config from '@/views/config/list'
	import users from '@/views/users/list'
	import kechengleixing from '@/views/kechengleixing/list'

export const routes = [{
		path: '/login',
		name: 'login',
		component: () => import('../views/login.vue')
	},{
		path: '/',
		name: '首页',
		component: () => import('../views/index'),
		children: [{
			path: '/',
			name: '首页',
			component: () => import('../views/HomeView.vue'),
			meta: {
				affix: true
			}
		}, {
			path: '/updatepassword',
			name: '修改密码',
			component: () => import('../views/updatepassword.vue')
		}
		
		,{
			path: '/jianshenjiaolian',
			name: '健身教练',
			component: jianshenjiaolian
		}
		,{
			path: '/forum',
			name: '我的发布',
			component: forum
		}
		,{
			path: '/news',
			name: '系统公告',
			component: news
		}
		,{
			path: '/jianshenkecheng',
			name: '健身课程',
			component: jianshenkecheng
		}
		,{
			path: '/jianshenzhishi',
			name: '健身知识',
			component: jianshenzhishi
		}
		,{
			path: '/yonghu',
			name: '用户',
			component: yonghu
		}
		,{
			path: '/jianshenqicai',
			name: '健身器材',
			component: jianshenqicai
		}
		,{
			path: '/storeup',
			name: '我的收藏',
			component: storeup
		}
		,{
			path: '/kechenggoumai',
			name: '课程购买',
			component: kechenggoumai
		}
		,{
			path: '/config',
			name: '轮播图',
			component: config
		}
		,{
			path: '/users',
			name: '管理员',
			component: users
		}
		,{
			path: '/kechengleixing',
			name: '课程类型',
			component: kechengleixing
		}
		]
	},
]

const router = createRouter({
	history: createWebHashHistory(process.env.BASE_URL),
	routes
})

export default router
