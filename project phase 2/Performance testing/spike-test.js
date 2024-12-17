import http from 'k6/http';
import { check, sleep } from 'k6';

export let options = {
  stages: [
    { duration: '10s', target: 10 },  // Ramp up to 10 users
    { duration: '10s', target: 500 }, // Spike to 500 users
    { duration: '20s', target: 10 },  // Drop back to 10 users
    { duration: '10s', target: 0 },   // Ramp down to 0
  ],
  insecureSkipTLSVerify: true,
};

export default function () {
  const res = http.get('https://45.136.236.146/');
  check(res, {
    'status is 200': (r) => r.status === 200,
  });
  sleep(1);
}
